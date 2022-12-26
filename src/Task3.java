package src;// задание 3
import java.io.FileNotFoundException;

public class Task3 {
    public static void init() {
        System.out.println(">>> Task 3 start <<<");
        main();
    }

    // убрал в методе указание на то что он выбрасывает исключение, так как исключение
    // фактически не выбрасывается, а сразу обрабатывается
    private static void main(){
        // блок с перехватом любого исключения Throwable перенес в конце всех блоков catch
        // так как все исключения наследуются от Throwable
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    // указано что метод выбрасывает исключение, но в методе нигде не было указания на то
    // при какой ситуации метод выбрасывает исключение
    // указал, что если нет возможности вывести результат в консоль, то будет выброшено исключение
    private static void printSum(Integer a, Integer b) throws FileNotFoundException {
        if (System.out == null) {
            throw new FileNotFoundException("Console out not found");
        }
        System.out.println(a + b);
    }
}
