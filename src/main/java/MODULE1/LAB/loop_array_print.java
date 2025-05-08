package MODULE1.LAB;

public class loop_array_print {

    public static void main (String[] args){
        String[] superhe = {"Spider-Man", "Thor", "Loki", "Wolverine"};
        int[] yearIntro = {1962, 1962, 1949, 1974};

        System.out.println("Superhero Names: " );
        for (String hero: superhe){
            System.out.println("- " + hero);
        }
        System.out.println("Introdution Year: " );
        for (int year: yearIntro){
            System.out.println("- " + year);
        }
    }
}
