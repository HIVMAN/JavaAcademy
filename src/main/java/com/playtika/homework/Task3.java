package com.playtika.homework;

public class Task3 {

    static int x = 2;
    static int y = 7;
    static int z = 4;

    private static double vectorLength() {
        return  Math.sqrt((x*x)+(y*y)+(z*z));
    }

    private static double vectorSingle() {
        return x/vectorLength();
    }

    public static void main(String[] args) {
  //      System.out.println("Длинна вектора: " + vectorLength() + " Единичный вектор: " + vectorSingle());
        toSingleVector(5, 0, 0);


    }

    private static void toSingleVector(int x, int y, int z) {
        int lenght = calculateLenght(x, y, z);
        int singleVectorX = toSingle(x, lenght);
        int singleVectorY = toSingle(y, lenght);
        int singleVectorZ = toSingle(z, lenght);

        System.out.println("X:"+singleVectorX+" Y:"+singleVectorY+" Z:"+singleVectorZ);
    }

    private static int calculateLenght(int x, int y, int z) {
        return (int) Math.sqrt((x*x)+(y*y)+(z*z));
    }

    private static int toSingle(int coordinate, int lenght) {
        return coordinate/lenght;
    }



}
