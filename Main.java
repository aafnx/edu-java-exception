//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
// т.е. ваше.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 78, 9};
        int[] array2 = new int[]{0, 3, 654, 3, 20};
        divide(5, 0);
        getByIndex(array, 10);
        parseToInt("Hello");

        System.out.println(Arrays.toString(newArrayFromDifferenceTwoArrays(array, array2)));

        System.out.println(Arrays.toString(newArrayFromDivisionTwoArrays(array, array2)));

        System.out.println("> > > end < < <");
    }
    // задание 3
    public static Double[] newArrayFromDivisionTwoArrays(int[] arrayA, int[] arrayB) {
        int length = arrayA.length;
        if (arrayA.length != arrayB.length) {
            System.out.println("Длины массивов не равны");
            length = Math.max(arrayA.length, arrayB.length);
        }
        Double[] result = new Double[length];
        for (int i = 0; i < length; i++) {
            try {
                double n1 = arrayA[i];
                double n2 = arrayB[i];
                result[i] = divide(n1, n2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                result[i] = arrayA.length == length ? (double) arrayA[i] : (double) arrayB[i];

            }
        }
        return result;
    }

    // задание 2
    public static int[] newArrayFromDifferenceTwoArrays(int[] arrayA, int[] arrayB) {
        int length = arrayA.length;
        if (arrayA.length != arrayB.length) {
            System.out.println("Длины массивов не равны");
            length = Math.max(arrayA.length, arrayB.length);
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                result[i] = arrayA[i] - arrayB[i];
            } catch (Exception e) {
                System.out.println(e.getMessage());
                result[i] = arrayA.length == length ? arrayA[i] : arrayB[i];
            }
        }
        return result;
    }

    public static double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("На ноль делить нельзя");
        }
        return a / b;
    }

    // задание 1
    public static int getByIndex(int[] array, int index) {
        try {
            return array[index];
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
            return -1;
        }
    }
    // задание 1
    public static int parseToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
            return -1;
        }
    }
    // задание 1
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
            return 0;
        }

    }
}
