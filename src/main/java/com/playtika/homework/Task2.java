package com.playtika.homework;

public class Task2 {
    //Выполнить без исользования циклов!
    static int n = 45685;

    public static void main(String[] args) {

        String s = ""+n;

        System.out.println(s.charAt(s.length()-5));
        System.out.println(s.charAt(s.length()-4));
        System.out.println(s.charAt(s.length()-3));
        System.out.println(s.charAt(s.length()-2));
        System.out.println(s.charAt(s.length()-1));

    }

}
