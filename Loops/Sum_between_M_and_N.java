package Loop_Exercise;

import java.util.Scanner;

public class Sum_between_M_and_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int l = 0;
        while (m <= n) {
            l += m;
            m++;
        }
        System.out.println(l);
    }
}
