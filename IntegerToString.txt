public class IntegerToString {
    public static void main(String[] args) {
        int number = 10;
        
        String numStr = Integer.toString(number);
        String numStr2 = String.valueOf(number);
        
        String numStr3 = "" + number;
        
        System.out.println(numStr); 
        System.out.println(numStr2);
        System.out.println(numStr3);
    }
}