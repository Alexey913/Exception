public class Task2 {
    private static int sumMatrix (int[][] matrix) throws RuntimeException, NullPointerException{
        if (matrix == null)
            throw new NullPointerException("Matrix is null");
        if (matrix.length == 0)
            throw new RuntimeException("Matrix is empty");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length)
                throw new RuntimeException("Matrix is not square");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]!=0 && matrix[i][j]!=1)
                    throw new RuntimeException("Element is not correct");
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    // public static void main(String[] args) {
    //     int[][] matrix = {{1,0,1}, {1,1,0,4}, {1,1,1}};
    //     System.out.println(String.format("Sum of matrix: %d",sumMatrix(matrix)));
    // }

    public static void main(String[] args) {
        int[][] matrix = null;
        try{
            System.out.println(String.format("Sum of matrix: %d", sumMatrix(matrix)));
        }
        catch(Exception ex){
            System.err.println(String.format("Error was occured. %s", ex.getMessage()));
        }
    }
}
