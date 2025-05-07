*/
In this lab, you’ll help Kyle build a simple program for keeping track of various superheroes and the years they were introduced. Kyle isn’t sure how best to develop his program, so you tell him that arrays are probably the best way to store and manage this information efficiently. 

Goal

Can you help Kyle develop his program by printing the superheroes' names and dates of introduction, changing that information in an array of Strings and int, and comparing the length of the String and int arrays?
*/

  public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:" + superheroes);
        for (String hero: superheroes){
            System.out.println("-"  + hero);
        }
        //TODO 1: Print all the 5 superheroes names as suggested in the example
    // System.out.println("Superhero Names: " + Arrays.toString(superheroes));                    - simple version 
    // Output: Superhero Names: [Batman, Superman, Wonder Woman, Spider-Man, Iron Man]

        // Print the introduction years
        System.out.println("Introduction Years:" );
        for (int year: introductionYears){
            System.out.println("- " + year);
        }
        //TODO 2: Print the introductionYear of the superheroes.
   // System.out.println("Introduction Years: " + Arrays.toString(introductionYears));            - simple version 
  // Output: Introduction Years: [1939, 1938, 1941, 1962, 1963]
}
  */
  
                                                                                              Output (with loop version):
    Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man

Introduction Years:
- 1939
- 1938
- 1941
- 1962
- 1963
  */ 


  
