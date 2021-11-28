import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        System.out.print("Podaj liczbę ");
        int a =scan.nextInt();


        switch (a%2) {
            case 0:
                System.out.println("Liczba całkowita");
                break;

            default:
                System.out.println("Liczba nie całkowita");
                break;

        }
        switch (a%7){
            case 0:
                System.out.println("Liczab jest podzielna przez 7");
                break;

            default:
                System.out.println("Liczab nie jest podzielna przez 7");

        }

        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0,0};
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'z':
                    ++tablica[2];
                    break;
                case 'x':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nz: %d - razy   \nx: %d - razy\nq: %d - razy " +
                        "\npozostałe: %d - razy"
                ,
                tablica[0], tablica[1], tablica[2], tablica[3],tablica[4],tablica[5]);
    }

}


/* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
