package com.lion.demo.exercise;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        System.out.println("请任意输入一个字母：");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        System.out.println(letter.toUpperCase());
    }
}
