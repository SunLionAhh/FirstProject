package com.lion.demo.exercise;

import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.max;
//import static sun.swing.MenuItemLayoutHelper.max;

public class exercise07 {
    public static void main(String[] args) {
        int n,len;
        Scanner scanner = new Scanner(System.in);
        len = scanner.nextInt();
        n = scanner.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int maxT=0,minT=0;
        for (int i=0;i<n;i++){
            minT=max(minT, min(a[i],len-a[i]));
        }
        for (int i=0;i<n;i++){
            maxT=max(maxT, max(a[i],len-a[i]));
        }
        System.out.println("minT="+minT+" "+"maxT="+maxT);
    }
}
