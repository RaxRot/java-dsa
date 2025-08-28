package com.raxrot.fundamentals;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        //Convert decimal to binary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (number != 0) {
            int rem = number % 2;
            sb.append(rem);
            number /= 2;
        }
        String result = sb.reverse().toString();
        System.out.println(result);

        //check is even
         number = 10;
        if ((number & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
