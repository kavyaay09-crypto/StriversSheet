package Recursion;

import java.util.Scanner;

class SumofFirstN {

    static void F(int i, int Sum) {
        if (i < 1) {
            System.out.println(Sum);
            return;
        }
        F(i - 1, Sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        F(N, 0);
    }
}