package Lab2;

public class todo4 {
    public static void main(String[] args){
        String[] heros= {"Thor", "Wolverine", "Daredevil", "Hulk"};
        int[]  yrs = {1962, 1974, 1964, 1962};
        // TODO 4a: Print the original year of introduction of the third superhero
        System.out.println("Original third superhero introduction year: " + yrs[2] );

        // TODO 4b: Modify the year of introduction of the third superhero
        yrs[2 ] = 2002;

        // TODO 4c: Print the modified year of introduction of the third superhero
        System.out.println("Updated third superhero introduction year: " + yrs[2]);
    }
}
