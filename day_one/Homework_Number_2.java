import java.util.Scanner;

public class Homework_Number_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = 0;
        double n = scanner.nextInt();
        l = 21 - n;
        if (l <= 21) {
            System.out.println(l);
        }
        if (l > 21) {
            System.out.println(l * 2);
        }

    }
}
