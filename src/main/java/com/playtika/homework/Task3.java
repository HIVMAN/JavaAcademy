package com.playtika.homework;

public class Task3 {

    public static void main(String[] args) {
        toSingleVector(5, 0, 0);
    }

    private static void toSingleVector(int x, int y, int z) {

        int length = calculateLength(x, y, z);
        int singleVectorX = calculateSingleVector(x, length);
        int singleVectorY = calculateSingleVector(y, length);
        int singleVectorZ = calculateSingleVector(z, length);

        System.out.println("X:" + singleVectorX + " Y:" + singleVectorY + " Z:" + singleVectorZ);
    }

    private static int calculateLength(int x, int y, int z) {
        return (int) Math.sqrt((x * x) + (y * y) + (z * z));
    }

    private static int calculateSingleVector(int coordinate, int length) {
        return coordinate / length;
    }


}
