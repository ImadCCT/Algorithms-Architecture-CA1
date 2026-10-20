/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foodstorageapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FoodStorageApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CAPACITY = 8;

        foodStack stack = new foodStack(CAPACITY);
        FoodQueue queue = new FoodQueue(CAPACITY);

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

                System.out.println("\nInvalid input. " + "Please enter 1 to 6.");

                continue;
                
                switch (choice) {
                    
                    // ==================================
                // ADD
                // ==================================
                    case 1:

                    // Check capacity before asking for details
                    if (structureChoice == 1 && stack.isFull()) {

                        System.out.println("\nStack is full.");

                        break;
                    }
                    
                    if (structureChoice == 2 && queue.isFull()) {

                        System.out.println("\nQueue is full.");

                        break;
                    }
                    
                     // FOOD NAME

                    System.out.print("\nEnter food name: ");

                    String foodName = sc.nextLine().trim();

                    boolean validFood = false;

                    for (String food : allowedFoods) {

                        if (food.equalsIgnoreCase(foodName)) {

                            foodName = food;
                            validFood = true;

                            break;
                        }
                    }
                    
                     if (!validFood) {

                        System.out.println("\nInvalid food name.");

                        System.out.println("Allowed foods are:");

                        for (String food : allowedFoods) {

                            System.out.println("- " + food);
                        }

                        break;
                    }
                     
                     // WEIGHT

                    double weight;

                    while (true) {

                        System.out.print("Enter weight in grams: ");

                        String weightInput = sc.nextLine();

                        try {

                            weight = Double.parseDouble(weightInput);

                            if (weight <= 0) {

                                System.out.println( "Weight must be " + "greater than 0.");

                                continue;
                            }

                            break;

                        } catch (NumberFormatException e) {

                            System.out.println("Invalid weight. " + "Please enter a number.");
                        }
                    }
                    
                    // BEST-BEFORE DATE

                    LocalDate bestBefore;

                    while (true) {

                        System.out.print("Enter best-before date " + "(dd/MM/yyyy): ");

                        String dateInput = sc.nextLine();

                        try {

                            bestBefore = LocalDate.parse(dateInput,dateFormat);

                            LocalDate today = LocalDate.now();

                            LocalDate maximumDate = today.plusDays(14);

                            if (bestBefore.isBefore(today)) {

                                System.out.println("Best-before date " + "cannot be in the past.");

                                continue;
                            }

                            if (bestBefore.isAfter(maximumDate)) {

                                System.out.println("Best-before date cannot " + "be more than 14 days " + "from today.");

                                continue;
                            }

                            break;

                        } catch (DateTimeParseException e) {

                            System.out.println("Invalid date format. " + "Please use dd/MM/yyyy.");
                        }
                    }

                }
                
              
        }
    }
    }
}