import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int index =57057;
           
        for(int i = 100; i > 0; i--){
            System.out.println(i);
            if(i%7==0)
            {
                System.out.println("56057   " + i +" Liczba jest podzielna przez 7");
            }
             
         }
          
         System.out.println("Zad2");
         
        
        int[] tab = new int[5];
        System.out.println("Podaj wartość komurki");
        tab[0] =  scan.nextInt();
        System.out.println("Podaj wartość komurki");
        tab[1] =  scan.nextInt();
        System.out.println("Podaj wartość komurki");
        tab[2] =  scan.nextInt();
        System.out.println("Podaj wartość komurki");
        tab[3] =  scan.nextInt();
        System.out.println("Podaj wartość komurki");
        tab[4] =  scan.nextInt();
        
        System.out.println("");
       
       
         for (int zmienna : tab) 
        {
            System.out.println(zmienna+" ");
        } 
            
        
        
	}

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
       
}
