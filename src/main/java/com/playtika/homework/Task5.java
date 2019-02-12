package com.playtika.homework;

import java.util.Scanner;

public class Task5 {
    /*
    Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
    трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
    */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please fill in prise of 1 kilo of candies: ");
        float candiesPrise = console.nextFloat();
        System.out.println("Please fill in prise of 1 kilo of cookies: ");
        float cookiesPrise = console.nextFloat();
        System.out.println("Your order costs: " + calculatePrice(candiesPrise, cookiesPrise) + " $");

    }

    private static float calculatePrice(float candiesKgPrice, float cookiesKgPrise) {
        float orderPrice = (2 * candiesKgPrice + 1.8f * cookiesKgPrise) * 3;
        return orderPrice;

    }
}
