public class ConvertToString {
    public static void main(String[] args) {
        char ch = 'a';
        
        String str = Character.toString(ch);
        
        String str2 = String.valueOf(ch);
        
        System.out.println(str);
        System.out.println(str2);
    }
}