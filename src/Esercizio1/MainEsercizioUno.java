package Esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class MainEsercizioUno{
    public static void main(String[] args) {
        int[] arrayNumeriCasuali = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arrayNumeriCasuali));
        int numero = 10;
        int posizione = 0;

        boolean ciclo = false;

        while (!ciclo) {
            try {
                while (numero != 0) {

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Dimmi un numero da 1 a 10");
                    numero = scanner.nextInt();

                    if (numero == 0) {
                        System.out.println("PROGRAMMA TERMINATO");
                        ciclo = true;
                    } else {
                        System.out.println("Dimmi in che posizione, da 1 a 5, devo mettere il numero ");
                        posizione = scanner.nextInt();

                        arrayNumeriCasuali[posizione - 1] = numero;
                        System.out.println(Arrays.toString(arrayNumeriCasuali));
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("La posizione indicata non esiste. Indicare un numero da 1 a 5");
            }

        }
    }
}
