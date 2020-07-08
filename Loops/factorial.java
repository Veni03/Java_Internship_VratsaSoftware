package Loop_Exercise;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 1;

        int l = 1;
        while (m <= n) {
            l *= m;
            m++;
        }
        System.out.println(l);
    }
}
