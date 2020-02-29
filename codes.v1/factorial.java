public class factorial {
    public static void main(String[] args) {
        int num = 6 ; 
        long factoriyelnum = multiplyNumbers(num);
        System.out.println("factoriyel num = "+ num+ "factoriyel "+ factoriyelnum);
        
    }
    
    public static long multiplyNumbers(int num){
        
        if(num >= 1){
            return num * multiplyNumbers(num-1);
            
        }
        else{
            return 1;
        }
    }
}
    
