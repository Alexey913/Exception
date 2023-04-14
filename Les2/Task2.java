package Les2;

public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                try {
                    for (int j = 0; j < 5; j++) {
                        sum = sum(arr[i][j], sum);
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    sum+=0;
                }
            }
        }
        catch (NullPointerException e){
            sum = 0;
        }
        return sum;
    }

    public static int sum(String arr_i_j, int sum) {
        int val;
        try {
            val = Integer.parseInt(arr_i_j);
        } catch (NumberFormatException e) {
            val = 0;
        }
        sum += val;
        return sum; 
    }

    public static void main(String[] args) {
        String [][] array = new String[][] {{"1","1","1","1","1","1"}, {"1","1","1","1","1","1"}, {"1","1","1","1","1","1"}, {"1","1","1","1","1","1"}};
        System.out.println(sum2d(array));
    }


}
