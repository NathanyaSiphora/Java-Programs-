public class MatrixAdd {

    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} }; 
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4} };
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++) 
        {
            for(int j = 0; j < cols; j++) 
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of two matrices: ");
        for(int[] row : sum) {
            for (int element : row) {
                System.out.print(element + "    "); 
            }
            System.out.println();
        }
    }
}