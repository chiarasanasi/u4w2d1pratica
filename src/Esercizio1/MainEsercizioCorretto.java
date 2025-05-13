package Esercizio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainEsercizioCorretto {

    public static void main(String[] args) {
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            Random r = new Random(); //creo oggetto della classe Random
            numeri[i] = r.nextInt(1, 10); //vado a creare un numero randomico intero da 1 a 10
        }

        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        Scanner scanner = new Scanner(System.in);

        int valore;

            do {
                valore = 4 ; //valore fisso che non verrà mai usato, se non per far ripartire il do


                try {
                System.out.println("Dammi un valore");
                valore = scanner.nextInt();


                System.out.println("Dammi l'indice dell'array");
                int indice = scanner.nextInt();


                    numeri[indice] = valore;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Indice non esistente. L'array è formato da soli 5 elementi");
                }
                catch (InputMismatchException e){
                    System.out.println("Input non valido, inserisci un numero");
                    scanner.nextLine();
                }

                for (int i = 0; i < numeri.length; i++) {
                    System.out.println(numeri[i]);

                }

            }
            while (valore != 0);

    }

}
