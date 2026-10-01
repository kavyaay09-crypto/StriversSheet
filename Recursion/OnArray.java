package Recursion;

import java.util.Arrays;

class OnArray {

    static void F(int[] a, int l, int r) {
        if (l >= r)
            return;
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        F(a, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        F(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}