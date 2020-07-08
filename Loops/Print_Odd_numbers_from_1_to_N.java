package Loop_Exercise;

import java.util.Scanner;

public class Print_Odd_numbers_from_1_to_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstnumber = 1;
        while (firstnumber <= n) {
            if (firstnumber % 2 == 0) {
                System.out.println(firstnumber + " ");
            }


            firstnumber++;
        }
    }

}
