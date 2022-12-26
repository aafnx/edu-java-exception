package src;

import java.util.Scanner;

public class Task1 {
    private static String scanConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter float number -> ");
        String t = scanner.nextLine();
        try {
            Float.parseFloat(t);
        } catch (Exception e) {
            System.out.println("Error");
            t = "error";
        }
        return t;
    }
    public static float getFloat() {
        System.out.println(">>> Task 1 start <<<");
        while (true) {
            String s = Task1.scanConsole();
            if (!(s.equals("error"))) {
                return Float.parseFloat(s);
            }
        }
    }

}
