package AssignmentActivity;

public class Todo4 {

        public static void main(String[] args){
            String firstName = "Elya";
            String lastName = "Ayase";
            String movieName = "Adventure of Thor";
            int ticketsNumber = 4;
            double price = 23.30;
            System.out.println("Customer, the movie name, the amount of tickets and the price per ticket: " + firstName + lastName + movieName + ticketsNumber + price);

            double totalP;
            totalP = ticketsNumber * price;
            System.out.println("Toat price is: " + totalP);
        }

}
