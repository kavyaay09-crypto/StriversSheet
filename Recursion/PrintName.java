package Recursion;

import java.util.Scanner;

class PrintName {

    static void F(int i, int N) {
        if (i > N)
            return;
        System.out.println("Kavya");
        F(i + 1, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        F(1, N);
    }
}