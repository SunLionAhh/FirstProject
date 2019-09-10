package com.lion.demo.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x[] = new int[1024];
        int a[] = new int[n];
        int z=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int length = a[i]+a[j]+a[k];
                    int ma = a[k];
                    int rest = length-ma;
                    if (ma<rest) {
                        if (length>ans){
                            ans=length;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
