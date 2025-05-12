package MODULE1.LAB;

public class todo1 {
        public static void main(String[] args) {
            String[] spH = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
            int[] yearsin = {1939, 1938, 1941, 1962, 1962};

            System.out.println("Super Hero names:");
            for (int i = 0; i < spH.length; i++) {
                System.out.println((i + 1) + ". " + spH[i]);
            }
            System.out.println("\nDebut Years:");
            for (int i = 0; i < yearsin.length; i++){
                System.out.println((i + 1) + ". " + yearsin[i]);
            }
        }
    }
