import java.util.Arrays;
public class ArraySort{
public static void main(String[] args)
{
int [] numbers = {5,2,3,4,6,1};
System.out.println("unsorted Array:"+Arrays.toString(numbers));
Arrays.sort(numbers);
System.out.println("Sorted Array:"+Arrays.toString(numbers));
}
}