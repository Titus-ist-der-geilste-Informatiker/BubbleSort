import java.util.Scanner;

public class BubbleSort {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Menge zahlen: ");
    int menge = input.nextInt();

    while (menge <= 0) {
        System.out.print("geben sie eine positive Menge an: ");
        menge = input.nextInt();
    }

    int[] werte = new int[menge];

    for (int i = 0; i < werte.length; i++) {
        System.out.print("Werte " + i + ": ");
        werte[i] = input.nextInt();
    }

    int grenze = werte.length - 1;
    boolean getauscht;

    while (grenze > 0) {
        getauscht = false;

        for (int i = 0; i < grenze; i++) {


            if (werte[i] > werte[i + 1]) {

                int temp = werte[i];
                werte[i] = werte[i + 1];
                werte[i + 1] = temp;
                getauscht = true;

            }
        }

        grenze--;

        if (!getauscht) {
            break;
        }

    }



    for (int i = 0; i < werte.length; i++) {
        System.out.print(werte[i] + " ");
    }
    System.out.println();
}

}