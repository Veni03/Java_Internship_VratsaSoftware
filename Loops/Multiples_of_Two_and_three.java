package Loop_Exercise;

import java.util.Scanner;

public class Multiples_of_Two_and_three{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstnumber = 1;
        while (firstnumber <= n) {
            if ((firstnumber % 2 == 0) && (firstnumber % 3 == 0) ) {
                System.out.println(firstnumber + " ");
            }
            firstnumber++;
        }
    }

}
