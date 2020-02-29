import java.util.Scanner;


public class interest_calculator {
   public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bu bir faiz uygulamasıdır.");
        System.out.println("Yıllık faiz için 1'e, Aylık faiz için 2'ye, günlük faiz için 3'e basınız:");
        int girilmek_istenen_mevduat = scanner.nextInt();
        System.out.println("Ne kadar paranız var");
        int ne_kadar_paranız_var = scanner.nextInt();
        
        
        
        switch (girilmek_istenen_mevduat){
            
            case(1):
                System.out.println("Paranızı kaç yıl tutmak istersiniz: ");
                int yıl = scanner.nextInt();
                int yıllık_faiz = (int) ((ne_kadar_paranız_var/100)*(12.2)*yıl);
                int yıllık_net_gelir = ne_kadar_paranız_var-yıllık_faiz;
                System.out.println("Faiz'inizin size getirisi"+yıl+"yıl'da"+yıllık_net_gelir+"liradır");
                break;
            
            case(2):
                System.out.println("Paranızı kaç ay tutmak istersiniz: ");
                int ay = scanner.nextInt();
                int aylık_faiz = (int) ((ne_kadar_paranız_var/100)*(1.1*12)*ay);
                int aylık_net_gelir = ne_kadar_paranız_var-aylık_faiz;
                System.out.println("Faiz'inizin size getirisi"+ay+"ay'da"+aylık_net_gelir+"liradır");
                break;
            
            
            case(3):
                System.out.println("Paranızı kaç gün tutmak istersiniz: ");
                int gun = scanner.nextInt();
                int gunluk_faiz = (int) ((ne_kadar_paranız_var/100)*(0.89*365)*gun);
                int gunluk_net_gelir = ne_kadar_paranız_var - gunluk_faiz  ;
                System.out.println("Faiz'inizin size getirisi"+gun+"gün'de"+gunluk_net_gelir+"liradır");
                break;
                
        }
        
    }
 
}
