package com.playtika.homework;

import java.util.Scanner;

public class Task4 {

    //Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please type distance in kilometers: ");
        double distance = console.nextDouble();
        System.out.println("Please type time in minutes: ");
        double time = console.nextDouble();
        System.out.println("Your speed is: " + calculateSpeed(time, distance) + " m/s");

    }

    public static double calculateSpeed(double timeInMinutes, double distanceInKilometers) {
        if (timeInMinutes == 0) {
            throw new IllegalArgumentException("time should be not zero");
        }
        return convertKilometersToMetres(distanceInKilometers) / convertMinutesToSeconds(timeInMinutes);
    }

    private static double convertMinutesToSeconds(double minutes) {
        return minutes * 60;
    }

    private static double convertKilometersToMetres(double kilometers) {
        return kilometers * 1000;
    }
}
