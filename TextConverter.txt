public class TextConverter  {
    public static void main(String[] args) {
        String str = "Hello WORLD";
        
        String lowerCase = toLowerCase(str);
        String upperCase = toUpperCase(str);
        
        System.out.println("Original: " + str);
        System.out.println("Lower Case: " + lowerCase);
        System.out.println("Upper Case: " + upperCase);
    }
    
    public static String toLowerCase(String str) {
        char[] array = str.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i] > 64 && array[i] < 91) {
                array[i] = (char) (array[i] + 32); 
            }
        }
        return new String(array);
    }

    public static String toUpperCase(String str) {
       char[] array = str.toCharArray();
       for(int i = 0; i < array.length; i++) {
          if(array[i] > 96 && array[i] < 123) {
             array[i] = (char)(array[i] - 32);
          }
       }
       return new String(array); 
    }
}