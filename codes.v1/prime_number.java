import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean flag = false;
        int prime = scanner.nextInt();
        for(int i = 2; i <= prime/2; ++i){
            if (prime % i == 0){
                flag =true;
                break;
            }
        }
        if (!flag){
            System.out.println(prime+"is a prime number");
        }
        else{
            System.out.println(prime+"is a not prime number");
        }
    }
}

