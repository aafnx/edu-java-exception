//1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
//
// 2. Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
// 3. Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Main {
    public static void main(String[] args) throws Exception {
        // задание 1
        Task1 task1 = new Task1();
//        System.out.println(task1.get());

        // задание 2
        // добавил еще один блок catch, который перехватывет ошибку
        // выхода за пределы массива
        int[] intArray = new int[4];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
        }

    }
}
