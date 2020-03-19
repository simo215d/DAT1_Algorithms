import static java.lang.Math.pow;

public class Kompliceret {

    public static void main(String[] args) {

        MyTimer.start();

        int n = 30;

        long resultat = 0;

        // Denne algoritme tager meget lang tid at gennemføre, og har en algoritmisk kompleksitet på O(N^2)
        for (int i = 1; i < n; i++) {
            System.out.print(".");
            for (int j = 1; j <= Math.pow(2, i); j++) {
                     resultat += i+j;
            }

        }
        
        System.out.println("Resultat " + resultat);
        MyTimer.stop();

    }
}
