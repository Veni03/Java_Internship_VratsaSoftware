import java.util.Scanner;

public class Homework_Number_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double x1 = 0;
        double x2 = 0;
        double D = 0;
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        if (D == 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println("x1 = x2");
        }
        if (D < 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Няма реални корени");

        }
    }
}
