package AssignmentActivity;
import java.util.Scanner;


public class Todo1arraysInput {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);  // create scanner

        // get user input
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        firstName = firstName.toLowerCase();


        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter the movie title : ");
        String movieName = input.nextLine();

        System.out.println("Enter how many tickets you need : ");
        int ticketNumber = input.nextInt();

        System.out.println("Enter the price per ticket : ");
        double price = input.nextDouble();


        //printing results
        System.out.println("Customer:" + firstName + " " + lastName);
        System.out.println("Movie Title: " +movieName);
        System.out.println("Tickets: " + ticketNumber);
        System.out.println("Price per ticket: $" + price);

        //close the scanner
        input.close();


    }
}
