import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPull {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 3};
        
        
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        
        list.remove((Integer)3);
        
        
        arr = list.toArray(new Integer[0]);
        
        System.out.println(Arrays.toString(arr));
    }
}