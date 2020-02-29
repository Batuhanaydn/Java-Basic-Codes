
import java.util.Scanner;

public class binary_constraction {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();
        String decimalString = "";
        
        for (int i = sayi; i>0;i/=2){
            decimalString = (i%2) + decimalString;
            
        }
        System.out.println(decimalString);
    }
    

}
