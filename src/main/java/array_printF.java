
public class array_printF {

    //    printf() helps in formatting (e.g., fixed-width columns).
    public static void main(String[] args) {
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        System.out.println("Superheroes and Their Introduction Years:");
        for (int i = 0; i < superheroes.length; i++) {                                    //The loop runs as long as i is less than the length of the array, If they had different lengths, this causes an ArrayIndexOutOfBoundsException
            System.out.printf("%-12s - %4d%n", superheroes[i], introductionYears[i]);
        }
    }
}