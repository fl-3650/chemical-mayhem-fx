/*
 * Copyright (c) 2024. RGBTeam
 */


package com.rgbteam.cmf.chemistry;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compound {
    private final Element[] compound;


    public Compound(String rawCompound) {
        List<Element> elements = parseCompound(rawCompound);
        compound = elements.toArray(new Element[0]);

//        if (!isValidCompound()) {
//           StringBuilder compoundSymbols = new StringBuilder();
//
//            for (var e : compound) {
//                compoundSymbols.append(e.getShortName());
//            }
//
//            throw new InvalidCompoundException("INVALID COMPOUND: " + compoundSymbols);
//        }
    }


    private List<Element> parseCompound(String rawCompound) {
        List<Element> elements = new ArrayList<>();
        Pattern pattern = Pattern.compile("([A-Z][a-z]*)(\\d*)|(\\()|(\\))|(\\d+)");
        Matcher matcher = pattern.matcher(rawCompound);

        List<Element> subElements = new ArrayList<>();
        int count = 1;

        while (matcher.find()) {
            String elementSymbol = matcher.group(1);
            String elementCountStr = matcher.group(2);
            String group = matcher.group();
            String groupCountStr = matcher.group(5);

            if (elementSymbol != null) {
                Element element = PeriodicTable.getElementByShortName(elementSymbol);
                int elementCount = (elementCountStr.isEmpty()) ? 1 : Integer.parseInt(elementCountStr);

                for (int i = 0; i < count * elementCount; i++) {
                    subElements.add(element);
                }

            } else if (group.equals("(")) {
                if (!subElements.isEmpty()) {
                    elements.addAll(subElements);
                    subElements.clear();
                }
            } else if (groupCountStr != null) {
                int subCount;
                subCount = Integer.parseInt(groupCountStr);
                for (int i = 0; i < subCount; i++) {
                    elements.addAll(subElements);
                }
                subElements.clear();
            }
        }

        elements.addAll(subElements);
        return elements;
    }


    // checks if compound can exist by verifying that sum of elements' oxid. states can be equal 0
    private boolean isValidCompound() {
        List<Integer> allOxidStates = new ArrayList<>();

        for (Element element : compound) { // in this 'for' loop I add all oxid states that elements may possess
            int[] currentElementOxidStates = element.getOxidationStates();
            for (Integer i : currentElementOxidStates) {
                allOxidStates.add(i);
            }
        }

        for (int i = 0; i < allOxidStates.size(); i++) { // if any of sums = 0 we count such compound as valid
            for (int j = i + 1; j < allOxidStates.size(); j++) {
                int sum = allOxidStates.get(i) + allOxidStates.get(j);
                if (sum == 0) {
                    return true;
                }
            }
        }

        return false;
    }


    public double calculateAtomicMass() {
        double totalMass = 0.0;

        for (Element element : compound) {
            totalMass += element.getAtomicMass();
        }
        return totalMass;
    }


//    //here we form a Cartesian set of lists
//    public List<List<Integer>> cartesianProduct(List<List<Integer>> lists) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (lists.size() == 0) {
//            result.add(new ArrayList<>());
//            return result;
//        }
//        List<Integer> firstList = lists.get(0); //bring first list
//        List<List<Integer>> remainingLists = cartesianProduct(lists.subList(1, lists.size())); //call recursively for the remaining lists
//        for (int i : firstList) {
//            for (List<Integer> list : remainingLists) {
//                ArrayList<Integer> newList = new ArrayList<>();
//                //form Cartesian set
//                newList.add(i);
//                newList.addAll(list);
//                result.add(newList);
//            }
//        }
//        return result;
//    }


    public Map<Element, int[]> getElementsOxidStates() {

        Map<Element, int[]> compoundOxidStates = new HashMap<>();
        for (Element el : compound) {
            compoundOxidStates.put(el, el.getOxidationStates());
        }
        return compoundOxidStates;
    }


    public String determineCompoundClass() {
        boolean hasO = false;
        boolean hasH = false;
        boolean hasMetal = false;
        boolean hasNonmetal = false;

        for (Element el : compound) {
            if (el.getShortName().equals("O")) {
                hasO = true;
            }
            if (el.getShortName().equals("H")) {
                hasH = true;
            }
            if (el.getElementGroup().contains("metals") || el.getElementGroup().contains("metalloids")) {
                hasMetal = true;
            }
            if (el.getElementGroup().equals("nonmetal") || el.getElementGroup().equals("halogen")) {
                hasNonmetal = true;
            }
        }

        if (new HashSet<>(Arrays.asList(compound)).size() == 2 && hasO) {
            return "Oxide";
        } else if (hasMetal && hasO && hasH) {
            return "Base";
        } else if (hasH && hasNonmetal && !hasMetal) {
            return "Acid";
        } else if (hasMetal && hasNonmetal) {
            return "Salt";
        } else {
            return "Unknown";
        }
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(compound);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Compound other = (Compound) obj;
        return Arrays.equals(compound, other.compound);
    }


    @Override
    public String toString() {
        return "Compound [parsedCompound=" + Arrays.toString(compound) + "]";
    }
}

 