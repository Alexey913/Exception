public class Task3 {

/*
Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
*/
    public static void main(String[] args) throws Throwable, NullPointerException, IndexOutOfBoundsException {
        try {
            int a = 90;
            int b = 3;
            // int b = 0; // ArithmeticException
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            // int[] abc = null; //NullPointerException
            abc[3] = 9; // IndexOutOfBoundsException
            abc[1] = 88;
        }

        // необходимо убрать catch (Throwable ex), т.к. throwable - обощенный класс исключений
        
        // catch (Throwable ex) {
        //     System.out.println("Что-то пошло не так...");
        // } 
        
        // либо убрать все остальные catch-и

        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0!");
        }
     }

     //в данном методе не будет исключений
     public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
     }
}
