import java.io.IOException;

public class Main {
    public static void main(String[] args) throws MyArrayDataException {
        String[][] array = new String [][] {{"1","8","3","4"}, {"5","6","7","8","9"}, {"9","8","11","12"}, {"13","7","15","19"}};
        System.out.println(ArrayMethod.sumElementsArray(array));
    }




    public static int divisionByZero(int a, int b) {
        int result;
        if (b == 0) {
            throw new DivisionByZeroException("На 0 делить нельзя!");
        }
        else {
           result = a/b;
        }
        return result;
    }

    public static void count() throws IOException { //к классу Counter
        try (Counter count = new Counter()) {
            System.out.println(count.add(9));
            System.out.println(count.checkingClose());
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
