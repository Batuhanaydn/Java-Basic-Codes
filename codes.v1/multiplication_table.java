
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int nereye_kadar = scanner.nextInt();
    for (int foo = 1 ; foo <= nereye_kadar; foo++){
        for(int bar = 1; bar <= nereye_kadar; bar++ ){
            System.out.println(foo+"x"+bar+"="+foo*bar);
        }
    }
    
    }

}
