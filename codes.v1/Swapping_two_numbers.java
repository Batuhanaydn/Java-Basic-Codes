
import java.util.Scanner;


public class Swapping_two_numbers {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("İlk numara:");
        int ilk_numara = scanner.nextInt();
        System.out.println("İkinci numara;");
        int ikinci_numara = scanner.nextInt();
        int temp = ilk_numara;
        ilk_numara = ikinci_numara;
        ikinci_numara = temp;
        System.out.println("numaralar 1. ,2.= "+"değiştirilmiş hali+"+ilk_numara+" "+ikinci_numara);
    }

}
