import java.util.Scanner;

public class Homework_Number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
            case 2:
            case 3:
                System.out.println(i * 10);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(i * 100);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(i * 1000);
                break;
            default:
                System.out.println("Error");


        }
    }
}