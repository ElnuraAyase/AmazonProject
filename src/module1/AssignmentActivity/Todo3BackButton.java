package AssignmentActivity;
import java.util.Scanner;


public class Todo3BackButton {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {



                String firstN = "", lastN = "", filmN = "";
                int ticketNu = 0;
                double price = 0.0;

                int currentfield = 1; //tracking the fields to return back later

                boolean confirmed = false;

                while (!confirmed) {

                    firstN = validName(input, "first");
                    lastN = validName(input, "last");
                    filmN = validName(input, "film");
                    ticketNu = validNumber(input, "number of tickets");
                    price = validPrice(input);

                    while (true){
                        double finalPrice = ticketNu * price;

                        System.out.println("\nTicket Summary");
                        System.out.println("1. First name: " + firstN);
                        System.out.println("2. last name: " + lastN);
                        System.out.println("3. Film number: " +filmN);
                        System.out.println("4. Number of tickets: " + ticketNu);
                        System.out.println("5. Price per ticket: $" + price);
                        System.out.println("6. Confirm and proceed");

                    }



                }
            }
        }

    private static  String validName(Scanner input, String nameType) {
            String name;
            while (true){
                System.out.println("Enter your" + nameType + " name: ");
                name = input.nextLine().trim();


                if(name.equals(name.toUpperCase())){
                    name.toLowerCase();
                    System.out.println("entered" + nameType + " name was uppercase, changed to lowercase");
                }

                if(!name.isEmpty()){
                    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                    break;
                }else{
                    System.out.println("You entered invalid name");
                }
            }

            return name;
        }

    private static int validNumber(Scanner input, String field){
        int number;
        while (true){
            System.out.println("enter your" +field + " number of tickets: ");
            String inputNumber = input.nextLine().trim();
            number = Integer.parseInt(inputNumber);  //converting to int

            if(number <= 0){
                System.out.println("Entered " + field + " must be a positive number.");
            }else {
                break;
            }

        }
        return number;
    }

    private static double validPrice(Scanner input) {
        int price;
        while (true) {
            System.out.println("enter the price per ticket: ");
            String inputPrice = input.nextLine().trim();
            price = Integer.parseInt(inputPrice);

            if (price <= 0) {
                System.out.println("Entered number is not a positive number");
            } else {
                break;
            }

        }
        return price;

    }
}
