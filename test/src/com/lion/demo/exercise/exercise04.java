package com.lion.demo.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];
        for (int i=0;i<3;i++){
            a[i]= scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i=0;i<3;i++) {
            System.out.println(a[i]);
        }
    }
}
