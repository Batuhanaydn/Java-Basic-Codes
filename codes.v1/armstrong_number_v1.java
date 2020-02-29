public class armstrong_number_v1 {
    public static void main(String[] args) {
        int number = 371, orjinalnumber , remainder , result = 0;
        orjinalnumber = number;
        while(orjinalnumber != 0){
            remainder = orjinalnumber % 10;
            result += Math.pow(remainder, 3);
            orjinalnumber /= 10;
            
        }
        if (result == number){
            System.out.println(number+"is an Armstrong number");
        }
        else{
            System.out.println(number+"is not an Armstrong number");

        }
    }
    
}
