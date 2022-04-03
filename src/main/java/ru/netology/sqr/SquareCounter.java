package ru.netology.sqr;

public class SquareCounter {
    public static int calculate( int downLimit, int upLimit) {
        int i;
        int j = 0;
        int k = downLimit;
        int l = upLimit;
        for (i = 10; i < 100;  i++) {
            if (i * i > k && i * i < l) {
                System.out.println(j++);
            }
        }
        System.out.println("End " + j);
        return j;
    }
}