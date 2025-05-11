package se.lexicon;

public class Main {
    public static void main(String[] args) {

        //följande 2 rader skapar samma värde /5/



        int nr = createNumber();
        int nr2 = 5;
        System.out.println("värde på nummer 1:  " + nr);
        System.out.println("värde på nummer 2:  " + nr2);

        String greeting = "hej och välommen";
        String greeting2 = createGreeting();

        System.out.println("värdet på greeting: " + greeting);
        System.out.println("värdet på greeting 2: " + greeting2);

        boolean compare1 = nr > nr2;
        boolean compare2 = isGreaterThan(nr, nr2);
        System.out.println("värdet på compare1: " + compare1);
        System.out.println("värdet på compare2: " + compare2);

        numberOne();

    }

    static void numberOne(){
        System.out.println("nu körs metod 1");
        numberTwo("Michel");
    }

    static void numberTwo(String name){
        System.out.println("hej " + name + ". nu körs metod2");

    }



    static int createNumber() {
        System.out.println("nu körs createNumber");
        int createNumber = 5;
        return createNumber;
    }

    static String createGreeting() {
        String createGreeting = "hej och välkommen";
        return createGreeting;
    }

    static boolean isGreaterThan(int nr1, int nr2) {
        if (nr1 > nr2) {
            return true;  // Om nr1 är större än nr2, returnera true
        } else {
            return false; // Annars false
        }
    }
}
