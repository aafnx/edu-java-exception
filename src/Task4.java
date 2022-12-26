package src;

import java.util.Scanner;

public class Task4 {
    private static void scan() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message -> ");
        String text = scanner.nextLine();
        if (text.equals("")) {
            throw new Exception("Message can't be empty");
        }
    }
    public static void init() {
        System.out.println(">>> Task 4 start <<<");
        try {
            Task4.scan();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
