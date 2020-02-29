public class inverted_pyramid {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i<=rows;i++){
            for(int j = rows; i <= j; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
