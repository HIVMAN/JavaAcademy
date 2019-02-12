package com.playtika.homework;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(calculateEquation1(Integer.MAX_VALUE, 210000, 8, 12));
        System.out.println(calculateEquation2(Integer.MAX_VALUE, 7, 13, 10));
        System.out.println(calculateEquation3(3111333, 0.44f, 864, 772247));
        System.out.println(calculateEquation4(100, 299, Integer.MAX_VALUE, 999));
    }

    private static long calculateEquation1(long x, long y, int z, int n) {
        return x - (y + 123) / z * n;
    }

    private static int calculateEquation2(int x, int y, int z, int n) {
        return (x + (50 - y * z) / n) - x;
    }

    private static float calculateEquation3(long x, float y, int z, float n) {
        return x / (y * (z - 1) - 564) + n;
    }

    private static double calculateEquation4(int x, double y, int z, double n) {
        return -x / -y + z / (n + 15);
    }
}
