package com.lion.demo.exercise;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int jc = 1;
        long result = 1;
        for (int i = 0; i < number; i++) {
            result = result * jc;
            jc++;
        }
        System.out.println(number + "的阶乘为" + result);
    }

}
