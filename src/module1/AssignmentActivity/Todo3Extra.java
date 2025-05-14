package AssignmentActivity;

import java.util.Scanner;

public class Todo3Extra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                // user name and last name + movie name
                String fName = getValidName(input, "first");
                String lName = getValidName(input, "last");
                String movieN = getValidName(input, "movie");

                // handle invalid number for number for price or ticket numbers
                int ticketsNum = getValidNumber(input, "number of tickets");
                double price = getValidPrice(input);

                double totalPr;
                totalPr = ticketsNum * price;

                // print them all

                System.out.println("\n  Ticket Summary  ");
                System.out.println("Customer: " + fName + " " + lName);
                System.out.println("Movie name: " + movieN);
                System.out.println("Tickets number: " + ticketsNum);
                System.out.println("Price per ticket: $" + price);
                System.out.println("Total price for all tickets: " + totalPr);
// ask to restart
                System.out.print(" Do you want to start over ? (yes / no): ");
                String again = input.nextLine().trim().toLowerCase();
                if (!again.equals("yes")) {
                    System.out.println("Exit succesfully done.");
                    break;
                }
            } catch (RestartException e) {
                System.out.println("\nRestarting the form ...\n");
            }
        }


        input.close();

    }


    private static String getValidName(Scanner input, String nameType) {

        String name;
        while (true) {
            System.out.println("Enter your " + nameType + " name: ");
            name = input.nextLine().trim(); //remove spaces around

            // if name upperCase or lowercase

            if (name.equals(name.toUpperCase())) {
                name = name.toLowerCase();
                System.out.println("Your " + nameType + " name was in all uppercases");
            }

            if (!name.isEmpty()) {
                name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("Invalid input, please enter a valid name " + nameType + " name.");
                ; // valid entered nme
            }
        }
        return name;
    }

    private static int getValidNumber(Scanner input, String field) {
        int number = 0;
        while (true) {
            try {
                System.out.println("Enter the " + field + ": ");
                String inputValue = input.nextLine().trim();
                number = Integer.parseInt(inputValue); //try to convert to integer


                if (number <= 0) {
                    System.out.println("The " + field + " must be a positive number.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter the valid price. ");
            }
        }
        return number;
    }

    private static double getValidPrice(Scanner input) {
        double price = 0.0;
        while (true) {
            try {
                System.out.println("Enter valid price for tickets: ");
                String inputValue = input.nextLine().trim();
                price = Double.parseDouble(inputValue);

                if (price <= 0) {
                    System.out.println("The price per ticket: ");
                } else {
                    break; // valid price
                }
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input, please enter a valid number for a price. ");
            }
        }
        return price;
    }

}

