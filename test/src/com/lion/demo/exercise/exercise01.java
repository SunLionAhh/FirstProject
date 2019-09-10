package com.lion.demo.exercise;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        if (number1<1) {
            System.out.println(number1+"既不是奇数也不是偶数");
        }else if (number1%2==1) {
            System.out.println(number1+"是奇数");
        }else {
            System.out.println(number1+"是偶数");
        }
    }
}
