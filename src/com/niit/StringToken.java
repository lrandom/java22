package com.niit;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("A B C");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        StringTokenizer stringTokenizer1 = new StringTokenizer("A,B,C", ",");
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.println(stringTokenizer1.nextToken());
        }

        StringTokenizer stringTokenizer2 = new StringTokenizer("A,B,C", ",",false);
        while (stringTokenizer2.hasMoreTokens()) {
            System.out.println(stringTokenizer2.nextToken());
        }
    }
}
