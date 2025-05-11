
package se.lexicon;

// https://www.youtube.com/watch?v=_yOoQE_S5g0&t=2s vecka 4 lektion 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("välkommen till plussa på. skriv in heltal så skriver jag ut summan av dom");
        System.out.println("skriv in 0 när du vill avsluta");

        int sum = 0; // måste vara utanför for loopen annars så kan den inte spara


        boolean exitProgram = false;

        while (exitProgram == false){
            int input = sc.nextInt();

            if(input == 0){
                exitProgram = true;
                System.out.println("summan av alla dina tal: "+ sum);
            }else {
                sum = add(sum, input);
            }





/*        for (int i = 0; i<3; i++){
            int input = sc.nextInt();
            sum = add(sum, input);
            System.out.println("värdet på sum: "+sum );*/




          // sum = add(sum, input);   // här raderas koden ifrån datorns minne
        }
       // System.out.println("vädet av dina 3 heltal: "+ sum);

    }

    static int add(int nr1, int nr2) {
        int result = nr1 + nr2;
        return result;

    }


}
