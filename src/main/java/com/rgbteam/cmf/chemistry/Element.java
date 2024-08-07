/*
 * Copyright (c) 2024. RGBTeam
 */


package com.rgbteam.cmf.chemistry;

import java.util.Arrays;

import java.util.Objects;

public class Element {
    private final String fullName;
    private final String shortName;
    private final int atomicNumber;
    private final String groupElement;
    private final double atomicMass;
    private final double molarMass;
    private final int protonAmount;
    private final int neutronAmount;
    private final int electronAmount;
    private final int[] valences;
    private final int[] oxidationStates;


    public Element(String shortName, String fullName, int number, String groupElement, double atomicMass,
                   int[] valences, int[] oxidationStates) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.atomicNumber = number;
        this.protonAmount = number;
        this.electronAmount = number;
        this.groupElement = groupElement;
        this.atomicMass = atomicMass;
        this.molarMass = atomicMass / 10;
        this.valences = valences;
        this.oxidationStates = oxidationStates;
        this.neutronAmount = (int) Math.round(atomicMass) - number;
    }


    public String getShortName() {
        return shortName;
    }


    public String getFullName() {
        return fullName;
    }


    public int getNumber() {
        return atomicNumber;
    }


    public String getElementGroup() {
        return groupElement;
    }


    public double getAtomicMass() {
        return atomicMass;
    }


    public double getMolarMass() {
        return molarMass;
    }


    public int getAtomicNumber() {
        return atomicNumber;
    }


    public int getProtonAmount() {
        return protonAmount;
    }


    public int getNeutronAmount() {
        return neutronAmount;
    }


    public int getElectronAmount() {
        return electronAmount;
    }


    public int[] getValences() {
        return valences;
    }


    public int[] getOxidationStates() {
        return oxidationStates;
    }


    @Override
    public String toString() {
        return "Element is " + fullName + " (" + shortName + ")\n" +
                "Atomic Number: " + atomicNumber + "\n" +
                "Element group: " + groupElement + "\n" +
                "Atomic Mass: " + String.format("%.4f", atomicMass) + " amu\n" +
                "Molar Mass: " + String.format("%.4f", molarMass) + " g/mol\n" +
                "Protons: " + protonAmount + "\n" +
                "Neutrons: " + neutronAmount + "\n" +
                "Electrons: " + electronAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        if (atomicNumber != element.atomicNumber) return false;
        if (Double.compare(atomicMass, element.atomicMass) != 0) return false;
        if (Double.compare(molarMass, element.molarMass) != 0) return false;
        if (protonAmount != element.protonAmount) return false;
        if (neutronAmount != element.neutronAmount) return false;
        if (electronAmount != element.electronAmount) return false;
        if (!fullName.equals(element.fullName)) return false;
        if (!shortName.equals(element.shortName)) return false;
        if (!groupElement.equals(element.groupElement)) return false;
        if (!Arrays.equals(valences, element.valences)) return false;
        return Arrays.equals(oxidationStates, element.oxidationStates);
    }


    @Override
    public int hashCode() {
        return Objects.hash(fullName, shortName, atomicNumber, groupElement, atomicMass, molarMass, protonAmount, neutronAmount, electronAmount, valences, oxidationStates);
    }
}