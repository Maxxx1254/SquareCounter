package ru.netology.sqr;

public class SquareCounter {
    public static int calculate(String[] args) {
            int i;
            for (i = 10; i < 100; i++) {
                if (i * i > 100 && i * i < 700) {
                    System.out.println(i);
                }
            }
            System.out.println("End");
            return i * i;
        }
    }
