import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 ==0)
                continue;
            System.out.print(i + " ");
        }

        for (int i = 0; i <= 100; i++) {
            if (i == 56)
                break;
            System.out.print(i + " ");
        }

        for (int i = 0; i < 100; i++) {
            if (i == 50)
                return;
            System.out.print(i + " ");
        }


    }

}




        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
