package AssignmentActivity;

import java.util.Scanner;

public class Todo3Check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {

                String fName = "", lName = "", movieN = "";
                int ticketsNum = 0;
                double price = 0.0;

                boolean confirmed = false;

                while (!confirmed) {

// gathering the inputs
                    // user name and last name + movie name
                    fName = getValidName(input, "first"); // "String" was removed
                    lName = getValidName(input, "last");  // "String" was removed
                    movieN = getValidName(input, "movie");  // "String" was removed

                    // handle invalid number for number for price or ticket numbers
                    ticketsNum = getValidNumber(input, "number of tickets");  // "int" was removed
                    price = getValidPrice(input);                                 // "double" was removed

                    while (true) {

                        double totalPr = ticketsNum * price;

                        // print them all

                        System.out.println("\n  Ticket Summary  ");
                        System.out.println("1. First name: " + fName);
                        System.out.println("2. Last name: " + lName);
                        System.out.println("3. Movie name: " + movieN);
                        System.out.println("4. Tickets number: " + ticketsNum);
                        System.out.println("5. Price per ticket: $" + price);
// extra line for double checking

                        System.out.println("6. Confirm or Proceed >");
//restart prompt
                        System.out.println("Ener a number to change a field, or 6 to confirm: ");
                        String choice = input.nextLine().trim();

                        switch (choice) {
                            case "1":
                                fName = getValidName(input, "first");
                                break;
                            case "2":
                                lName = getValidName(input, "last");
                                break;
                            case "3":
                                movieN = getValidName(input, "movie");
                                break;
                            case "4":
                                ticketsNum = getValidNumber(input, "number of tickets");
                                break;
                            case "5":
                                price = getValidPrice(input);
                                break;
                            case "6":
                                confirmed = true;
                                break;
                            default:
                                System.out.println("Invalid option. Try again. ");
                        }

                        if (confirmed) break;

                    }

                    double totalPr = ticketsNum + price;
                    System.out.println("\n Final Summary");
                    System.out.println("Customer: " + fName + " " + lName);
                    System.out.println("Mofvie name: " + movieN);
                    System.out.println("Tickets number: " + ticketsNum);
                    System.out.println("Price per ticket: " + price);
                    System.out.println("Total price for all tickets:  $" + totalPr);

// if user want to restart :

                    System.out.println("\n Do you want to restart over ? (yes / no): ");
                    String again = input.nextLine().trim();
                    if (!again.equals("yes")) {
                        System.out.println("Exit succesfully done. ");
                        break;
                    }
                }
            } catch (RestartException e) {
                System.out.println("\nRestarting the form ...\n");
            }
            catch (ExitException e){
                System.out.println("\n" +e.getMessage());
                break;
            }
        }
        input.close();
    }


    // checking the code part 2

    private static String getValidName(Scanner input, String nameType) throws RestartException, ExitException {   // added exception
        String name;

        while (true) {
            System.out.println("Enter your " + nameType + " name: ");
            name = input.nextLine().trim(); //remove spaces around


            checkForCommands(name);
            // if name upperCase or lowercase

            if (name.equals(name.toUpperCase())) {
                name = name.toLowerCase();
                System.out.println("Your " + nameType + " name was in all uppercases, adjusted successfuly");
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

    private static int getValidNumber(Scanner input, String field) throws RestartException, ExitException {  //new changes
        int number = 0;
        while (true) {
            try {
                System.out.println("Enter the " + field + ": ");
                String inputValue = input.nextLine().trim();
                number = Integer.parseInt(inputValue); //try to convert to integer

                checkForCommands(String.valueOf(number));                                                     //new changes


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

    private static double getValidPrice(Scanner input) throws RestartException, ExitException {      //new changes
        double price = 0.0;
        while (true) {
            try {
                System.out.println("Enter valid price for tickets: ");
                String inputValue = input.nextLine().trim();
                price = Double.parseDouble(inputValue);


                checkForCommands(String.valueOf(price));                        // new changes


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


    private static void checkForCommands(String input) throws RestartException, ExitException {
        if (input.equalsIgnoreCase("restart")) {
            throw new RestartException();
        }
        if (input.equalsIgnoreCase("exit")) {
                  throw new ExitException();
        }
    }

}


