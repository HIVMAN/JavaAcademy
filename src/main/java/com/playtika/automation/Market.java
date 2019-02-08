package com.playtika.automation;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please fill in prise of 1 kilo of candies: ");
        float candiesPrise = console.nextFloat();
        System.out.println("Please fill in prise of 1 kilo of cookies: ");
        float cookiesPrise = console.nextFloat();
        System.out.println("Your order costs: " + calculatePrice(candiesPrise, cookiesPrise) + "$");

    }
    public static float calculatePrice(float candiesKgPrice, float cookiesKgPrise){
        float orderPrice = 0.3f * candiesKgPrice + 0.4f * cookiesKgPrise;
        return orderPrice;

    }
}
