import java.util.Scanner;

public class Dog2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String breed = scanner.nextLine();

        String ownername = scanner.nextLine();

        int humanage = scanner.nextInt();

        int dogage = scanner.nextInt();

        String gender = scanner.nextLine();

        String color = scanner.nextLine();

        String specialfeatures = scanner.nextLine();

        String couples = scanner.nextLine();

        String kids = scanner.nextLine();

        System.out.println("Куче: " + name + ", " + breed + ", " + color);
        System.out.println("Собственост на: " + ownername);
        System.out.println("Има " + kids + "деца");
    }

}



