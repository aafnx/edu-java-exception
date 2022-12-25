import java.util.Scanner;

public class Task1 {
    public String scan() {
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
    public float get() {
        while (true) {
            String s = this.scan();
            if (!(s.equals("error"))) {
                return Float.parseFloat(s);
            }
        }
    }

}
