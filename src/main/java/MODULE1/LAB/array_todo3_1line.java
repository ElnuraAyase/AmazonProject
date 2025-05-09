package MODULE1.LAB;

public class array_todo3_1line {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};
        System.out.println("Third hero evolution: " + superheroes[2] + "->" + (superheroes[2] = "Wolverine"));
    }
}
