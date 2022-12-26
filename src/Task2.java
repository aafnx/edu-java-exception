package src;

public class Task2 {
    // добавил еще перехват ошибки выхода за пределы массива
    public static void init() {
        System.out.println(">>> Task 2 start <<<");
        int[] intArray = new int[4];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
