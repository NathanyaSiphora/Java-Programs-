public class StringToCharacter {
    public static void main(String[] args) {
        String str = "Hello";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); 
            System.out.println(ch);
        }
        
        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }
    }
}