
import java.util.Scanner;


public class division_theory {
      public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int bolunen = scanner.nextInt();
        int bolen = scanner.nextInt();
        int bolum = bolunen / bolen;
        int kalan = bolunen % bolen;
        System.out.println("Bölüm = "+bolum+ "kalan = "+kalan);
    }
  
}
