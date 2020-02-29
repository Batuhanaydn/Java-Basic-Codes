import java.util.Scanner;

public class odd_and_even_control{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true){
            System.out.println("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 0){
                System.out.println("Sayı çifttir");
            }
            else{
                System.out.println("Sayı tektir");
            }
                    
                
        }
            
    }
}

