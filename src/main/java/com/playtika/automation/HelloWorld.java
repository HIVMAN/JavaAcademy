package com.playtika.automation;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "Hello World!";
        char ch = 'A';
        char ch1 = 43;
        float a = 1000;
        float b = 20;
        float c = a / b;

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        System.out.printf("Your input: %s.", s);
        /*
        System.out.println(c + " " + ch);
        System.out.printf("%d + %d = %d", a, b, a+b);
        */
    }
}
