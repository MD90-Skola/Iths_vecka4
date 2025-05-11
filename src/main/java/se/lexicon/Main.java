
package se.lexicon;

// https://www.youtube.com/watch?v=_yOoQE_S5g0&t=2s vecka 4 lektion 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("välkommen till plussa på. skriv in 3st heltal så skriver jag ut summan av dom");

        int sum = 0; // måste vara utanför for loopen annars så kan den inte spara

        for (int i = 0; i<3; i++){

            int input = sc.nextInt();
            sum = add(sum, input);
            System.out.println("värdet på sum: "+sum );

          // sum = add(sum, input);   // här raderas koden ifrån datorns minne
        }
       // System.out.println("vädet av dina 3 heltal: "+ sum);

    }

    static int add(int nr1, int nr2) {
        int result = nr1 + nr2;
        return result;

    }


}
