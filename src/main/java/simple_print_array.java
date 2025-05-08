import java.util.Arrays;

public class simple_print_array {

    public static void main (String[] args){
        String[] superH = {" Batman", "Spiderman", "Thor", "Ironman" };
        System.out.println("SuperHero Names: " + Arrays.toString(superH));

        int[] introYear = { 1939, 1962, 1962, 1963};
        System.out.println("Introduction Year is: " + Arrays.toString(introYear));
    }
}
