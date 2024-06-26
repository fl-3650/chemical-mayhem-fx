/*
 * Copyright (c) 2024. RGBTeam
 */

package com.rgbteam.cmf.view;

import com.rgbteam.cmf.GeneralFlowController;
import com.rgbteam.cmf.chemistry.Element;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class CLIView {
    public static void main(String[] args) {
        GeneralFlowController controller = new GeneralFlowController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User!");

        label: while (true) {
            System.out.println("""

                    Enter:
                    1 - Get element info by its number (87, 43, etc.)
                    2 - Get element info by its short name ('H', 'As', etc.)
                    3 - Get element info by its full name ('Sodium', 'Neon', etc.)
                    4 - Calculate mass of a compound (M[NaCl] = 58.44 g/mol, M[FeSO4] = 151.901 g/mol, etc.)
                    5 - Show possible oxidation states
                    6 - Define compound's class
                    0 - Exit the program""");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Exiting...");
                    break label;
                case "1": {
                    System.out.print("Enter element's number: ");
                    String inputNumber = scanner.nextLine();
                    try {
                        int elementNumber = Integer.parseInt(inputNumber);
                        Element element = controller.retrieveElementByNumber(elementNumber);
                        if (element != null)
                            System.out.println(element);
                        else
                            System.out.println("Element not found.");

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid input.");
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter short designation: ");
                    String inputDesignation = scanner.nextLine();
                    Element element = controller.retrieveElementByShortName(inputDesignation);
                    if (element != null)
                        System.out.println(element);
                    else
                        System.err.println("Element not found.");
                    break;
                }
                case "3": {
                    System.out.print("Enter full name: ");
                    String inputFullName = scanner.nextLine();
                    Element element = controller.retrieveElementByFullName(inputFullName);
                    if (element != null)
                        System.out.println(element);
                    else
                        System.err.println("Element not found.");

                    break;
                }
                case "4":
                    System.out.print(
                            "Enter compound (Separate elements, numbers and parenthesis using ' ' or without spaces): ");
                    String unparsed = scanner.nextLine();
                    try {
                        double mass = controller.calculateCompoundsAtomicMass(unparsed);
                        System.out.println("The mass of the [" + unparsed + "] is: " + String.format("%.4f", mass));
                    } catch (Exception e) {
                        System.err.println("Invalid input or element not found: " + e.getCause());
                    }
                    break;
                case "5":
                    System.out.println(
                            "Enter compound (Separate elements, numbers and parenthesis using ' ' or without spaces): ");
                    String unparsed1 = scanner.nextLine();
                    try {
                        Map<Element, int[]> map = controller.findCompoundsOxidationStates(unparsed1);
                        StringBuilder stringBuilder = new StringBuilder();
                        for (Map.Entry<Element, int[]> entry : map.entrySet()) {
                            stringBuilder.append(entry.getKey().getShortName()).append(": ")
                                    .append(Arrays.toString(entry.getValue())).append("\n");
                        }
                        System.out.println(stringBuilder);
                    } catch (Exception e) {
                        System.err.println("Invalid input or element not found: " + e.getCause());
                    }
                    break;
                case "6":
                    System.out.println(
                            "Enter compound (Separate elements, numbers and parenthesis using ' ' or without spaces): ");
                    String unparsed2 = scanner.nextLine();
                    try {
                        String compoundClass = controller.retrieveClassOfCompound(unparsed2);
                        System.out.println("Class: " + compoundClass);
                    } catch (Exception e) {
                        System.err.println("Invalid input or element not found: " + e.getCause());
                    }
                    break;

                default:
                    System.err.println("No such command available");
                    break;
            }
        }
        scanner.close();
    }
}
