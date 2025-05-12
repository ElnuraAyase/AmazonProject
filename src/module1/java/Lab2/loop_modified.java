package Lab2;

public class loop_modified {
    public static void main(String[] args) {
        String[] spheros = {"Thor", "Wolverine", "Daredevil", "Hulk"};
        int[] yearsin = {1962, 1974, 1964, 1962};

        System.out.println("SuperHero Names and their Introduction Years: ");
        for (int i = 0; i < spheros.length; i++) {
            System.out.println(spheros[i] + " - " + yearsin[i]);
        }

    }
}