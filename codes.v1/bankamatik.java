import java.util.Scanner;

public class bankamatik {
     public static void main(String[] args) {
        int bakiye = 5000;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Hangi işlemi yaptırmak istersiniz;");
        System.out.println("1.İşlem bakiye öğrenme");
        System.out.println("2.İşlem Para çekme");
        System.out.println("3.Para yatırma");
        System.out.println("Seçmek istediğiniz işlem için numarasını giriniz. Çıkış yapmak için 0'a ya basınız.");
        int hesap_hareketi = scanner.nextInt();
        if (hesap_hareketi == 0){
            System.out.println("İyi günler dileriz");
            
        }
        switch(hesap_hareketi){
            case(1):
                System.out.println("Hesabınızdaki para = "+bakiye+"TL'dir");
                break;
            case(2):
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int cekilecek_para = scanner.nextInt();
                if(cekilecek_para>bakiye){
                    System.out.println("İşlem limitinizi aştınız daha sonra tekrar deneyiniz.");
                    break;
                }
                else{
                    System.out.println("Hesabınızda kalan para"+(bakiye-cekilecek_para+"TL'dır"));
                    break;
                }
                
            case(3):
                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                int yatirilacak_para = scanner.nextInt();
                int temp = yatirilacak_para+bakiye;
                System.out.println("Hesabınızdaki Güncel Miktar = "+temp+"TL'dir");
                break;
        }
    }

}
