package com.company;

import java.util.Scanner;

public class Main {
    public static int swap(int a, int b){
        return a;
    }
    public static int gcd(int a, int b) {
        if (a < b)
            a = swap(b, b = a);
        while (true) {
            int remainder = a % b;
            if (remainder == 0)
                break;
            a = b;
            b = remainder;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.println(gcd(a, b));
    }
}
