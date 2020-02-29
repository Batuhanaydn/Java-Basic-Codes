
import java.util.Scanner;

public class pow_algoritmy {
    public static void main(String[] args) {
        int toplam = 1;
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b>=1){
            toplam *= a;
            b--;
        }
        System.out.println(toplam);
    }
}


