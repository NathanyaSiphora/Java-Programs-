import java.util.List;
import java.util.ArrayList; 
import java.util.Collections;

public class FrequencyDemo {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);  
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
       
        int freq1 = Collections.frequency(numbers, 1);
        int freq2 = Collections.frequency(numbers, 2);
        
        System.out.println("Frequency of 1: " + freq1); 
        System.out.println("Frequency of 2: " + freq2);
    }
}