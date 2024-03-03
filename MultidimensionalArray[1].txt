public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] arr;  
        arr = new int[3][3];
        arr[0][0] = 1; 
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5; 
        arr[1][2] = 6;
        arr[2][0] = 7; 
        arr[2][1] = 8;
        arr[2][2] = 9;
        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.println(arr[0][2]+" ");
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.println(arr[1][2]+" ");
        System.out.print(arr[2][0] + " ");
        System.out.print(arr[2][1] + " ");
        System.out.println(arr[2][2]+" ");
    }
}