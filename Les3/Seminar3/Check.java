public class Check {
    public static boolean check (String[][] inputArray) {
        boolean result = true;
        if (inputArray.length == 4) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j].length != 4) return false;
                else result = true;
            }
        }
        else result = false;
        System.out.println(result);
        return result;
    }
}