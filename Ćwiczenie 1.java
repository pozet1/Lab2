public class MyClass {
    public static void main(String args[]) {
       /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i;
        int index =57057;
           i = 1000;
       
        do {
            //System.out.println("i: " + i);
            if(i%57==0)
            {
                System.out.println("56057   " + i +" Liczba jest podzielna przez 57");
            }
        } while (--i > 0);
    }
}
