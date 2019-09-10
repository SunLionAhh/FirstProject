package com.lion.demo.exercise;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long sum=0;
        long jc=1,j=1;
        for (int i=0;i<number;i++) {
            j=j*jc;
            sum = sum + j;
            jc++;
        }
        System.out.println("结果是："+sum);
    }
}
