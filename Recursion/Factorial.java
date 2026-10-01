package Recursion;

import java.util.Scanner;

class Factorial {

    static int F(int N) {
        if (N == 0)
            return 1;
        return N * F(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.println(F(N));
    }
}