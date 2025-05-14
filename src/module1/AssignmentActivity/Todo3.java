package AssignmentActivity;

public class Todo3 {

    //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price


    public static void main(String[] args){
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Elya";

        //TODO 1: Declare and initialize variable for Last Name
        String lastName = "Ayase";


        //TODO 1: Declare and initialize variable for Movie Title
        String movieName = "Adventure of Thor";

        //TODO 1: Declare and initialize variable for Number of tickets
        int ticketsNumber = 4;

        //TODO 1: Declare and initialize variable for Price per ticket
        double price = 23.30;

        System.out.println("Customer, the movie name, the amount of tickets and the price per ticket: " + firstName + lastName + movieName + ticketsNumber + price);

        double totalP;
        totalP = ticketsNumber * price;
        System.out.println("Toat price is: " + totalP);
    }
}
