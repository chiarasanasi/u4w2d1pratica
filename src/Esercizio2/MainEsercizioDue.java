package Esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEsercizioDue {
    public static void main(String[] args) {
        double kilometriPercorsi;
        double litriCarburanteConsumati;
        double kmPerLitroPercorsi;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Quanti kilometri hai percorso?");
            kilometriPercorsi = scanner.nextDouble();
//         kilometriPariA0(kilometriPercorsi);

            System.out.println("Quanti litri di carburante hai consumato?");
            litriCarburanteConsumati = scanner.nextDouble();
//            litriPariA0(litriCarburanteConsumati);

            kmPerLitroPercorsi = kilometriPercorsi / litriCarburanteConsumati;
            if (Double.isFinite(kmPerLitroPercorsi) || Double.isNaN(kmPerLitroPercorsi)) {
                throw new DivisioneException("Divisione non valida : risultato Infinity o NaN");
            }

            System.out.println("I km/l percorsi sono " + kmPerLitroPercorsi);
        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un numero");

    }

//    public static void kilometriPariA0(double kilometriPercorsi)throws DivisioneException{
//        if(kilometriPercorsi==0){
//            throw new DivisioneException("Il numero di kilometri percorsi non può essere pari a 0");
//        }
//    }
//
//    public static void litriPariA0(double litriCarburanteConsumati)throws DivisioneException{
//        if(litriCarburanteConsumati==0){
//            throw new DivisioneException("Il numero di litri consumati non può essere pari a 0");
//        }

    }}