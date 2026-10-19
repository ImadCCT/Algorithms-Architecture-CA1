/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TestingProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CAPACITY = 8;

        foodStack stack = new foodStack(CAPACITY);
        foodQueue queue = new foodQueue(CAPACITY);

        String[] allowedFoods = {
            "Burger",
            "Pizza",
            "Fries",
            "Sandwich",
            "Hotdog"
        };

        DateTimeFormatter dateFormat =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // ==========================================
        // CHOOSE DATA STRUCTURE
        // ==========================================

        int structureChoice;

        while (true) {

            System.out.println("\n====================================");
            System.out.println("     FAST FOOD STORAGE SYSTEM");
            System.out.println("====================================");
            System.out.println("Choose a data structure:");
            System.out.println("1. Stack");
            System.out.println("2. Circular Queue");
            System.out.println("====================================");

            System.out.print("Enter your choice: ");

            String input = sc.nextLine();

            try {

                structureChoice =
                        Integer.parseInt(input);

                if (structureChoice == 1 ||
                        structureChoice == 2) {

                    break;
                }

                System.out.println(
                        "\nPlease choose 1 or 2.");

            } catch (NumberFormatException e) {

                System.out.println(
                        "\nInvalid input. "
                        + "Please enter 1 or 2.");
            }
        }

        // ==========================================
        // MAIN MENU
        // ==========================================

        while (true) {

            System.out.println("\n====================================");
            System.out.println("       FAST FOOD STORAGE SYSTEM");
            System.out.println("====================================");

            if (structureChoice == 1) {

                System.out.println("Current Structure: STACK");

            } else {

                System.out.println(
                        "Current Structure: CIRCULAR QUEUE");
            }

            System.out.println("------------------------------------");
            System.out.println("1. Add Food Item");
            System.out.println("2. Remove Food Item");
            System.out.println("3. Peek Food Item");
            System.out.println("4. Display Food Items");
            System.out.println("5. Search Food Item");
            System.out.println("6. Exit");
            System.out.println("====================================");

            System.out.print("Enter your choice: ");

            String input = sc.nextLine();

            int choice;

            try {

                choice = Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "\nInvalid input. "
                        + "Please enter 1 to 6.");

                continue;
            }
        }
    }
}