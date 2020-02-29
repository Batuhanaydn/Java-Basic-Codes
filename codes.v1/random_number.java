public class random_number {
    public static void main(String[] args) {
        int random_sayi = (int)(Math.random()*(1000));
        System.out.println("Random yakalanan sayınız=" + random_sayi);
        int birler = random_sayi % 10;
        System.out.println(birler);
        int onlar = (random_sayi/10)%10;
        System.out.println(onlar);
        int yüzler = random_sayi/100;
        System.out.println(yüzler);
        int toplam = birler + onlar + yüzler;
        System.out.println("Birler + onlar + yüzler="+toplam);
    }
}


