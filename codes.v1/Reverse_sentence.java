public class Reverse_sentence {
    public static void main(String[] args) {
        String sentence = "Go fuck";
        String reverse = reverse(sentence);
        System.out.println("The reverse sentence is = "+reverse);
    }
    public static String reverse(String sentence){
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
        
    }
}
