package Lab2;

public class todo3 {


        public static void main(String[] args) {
            // Declare and initialize an array of superhero names
            String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

            // Declare and initialize an array of years
            int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

            // Print the superhero names
            System.out.println("Superhero Names:");
            for (String hero: superheroes){
                System.out.println("-"  + hero);
            }

            // Print the introduction years
            System.out.println("Introduction Years:" );
            for (int year: introductionYears){
                System.out.println("- " + year);
            }

            // TODO 3a: Print the original name of the third superhero
            System.out.println("Original third superhero name: " + superheroes[2]);

            // TODO 3b: Modify the third superhero name
            superheroes[2] = "Black Panther";

            // TODO 3c: Print the modified name of the third superhero
            System.out.println("Modified third superhero name: " + superheroes[2]);



        }
}
