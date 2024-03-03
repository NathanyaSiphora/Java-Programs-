public class TextCalculator {
    public static void main(String[] args) {
        String text = "Hello world. This is a test. Here it counts words and sentences.";
        
        int sentences = countSentences(text);
        int words = countWords(text); 
        int characters = countCharacters(text);
        
        System.out.println("Sentences: " + sentences);
        System.out.println("Words: " + words); 
        System.out.println("Characters: " + characters);
    }
    
    public static int countSentences(String str) {
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.' || str.charAt(i) == '!') {
                count++;
            }
        }
        return count;
    }
    
    public static int countWords(String str) {
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i-1))) {
               count++;
           }
        }
        return count+1;  
    }
    
    public static int countCharacters(String str) {
        return str.length();
    }
}