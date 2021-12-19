import java.util.Scanner;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        for(int i = 0; i <= 5; i++){
            System.out.println("Podaj nazwe zwierzęta");
            lista.add(scan.next());
            
        }
        odczytlListy((ArrayList) lista);
        System.out.println();

        lista.remove(5);
        lista.remove(4);


        lista.add("Lew");
        lista.add("Bocian");
        lista.add("Pies");
        odczytlListy((ArrayList) lista);

        System.out.println("\n Długość listy "+lista.size());
        Collections.sort(lista, Collections.reverseOrder());
        odczytlListy((ArrayList) lista);


    }

    public static void odczytlListy(ArrayList lista) {
        System.out.println("TERAZ JEST ODCZYT");
        for ( Object x : lista) {
            System.out.print(x + ", ");
        }
    }
}
/* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
