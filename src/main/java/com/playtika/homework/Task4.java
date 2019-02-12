package com.playtika.homework;

import java.util.Scanner;

public class Task4 {

    //Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please type distance: ");
        int distance = console.nextInt();
        System.out.println("Please type time: ");
        int time = console.nextInt();
        System.out.println("Your speed is: " + calculateSpeed(time, distance) + " m/s");

    }

    public static float calculateSpeed(int timeInMinutes, int distanceInKillometers) {
        return convertKilometersToMetres(distanceInKillometers) / convertMinutesToSeconds(timeInMinutes);
    }

    private static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    private static int convertKilometersToMetres(int kilometers) {
        return kilometers * 1000;
    }
}
