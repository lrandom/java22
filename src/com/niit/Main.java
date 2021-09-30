package com.niit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cách thứ 1
/*        int[] ages = new int[10];
        ages[0] = 1;
        ages[2] = 2;*/

        //null


        //Cách thứ hai
/*
        String[] names = new String[]{
                "Nam",
                "Long",
                "Linh",
                "Lê"
        };
*/

     /*   System.out.printf(name[0]);
        System.out.printf(name[1]);
        System.out.printf(name[2]);
        System.out.printf(name[3]);
*/
     /*   for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]+"");
        }

        for (String name: names
             ) {
            System.out.println(name);
        }*/

        int[][] matrixAge = new int[2][3];

        matrixAge[0][0] = 1;
        matrixAge[0][1] = 2;
        matrixAge[0][2] = 3;

        matrixAge[1][0] = 4;
        matrixAge[1][1] = 5;
        matrixAge[1][2] = 6;

/*        1 2 3
        4 5 6    */

        for (int i = 0; i < matrixAge.length; i++) {
            for (int j = 0; j < matrixAge[i].length; j++) {
                System.out.printf(matrixAge[i][j]+"");
            }
            System.out.printf("%n");
        }


        String[][] matrixNames = new String[][]{
                {"Linh","Lê","Nam"},
                {"Tuan","Vinh","Quang"}
        };

        for (int i = 0; i < matrixNames.length; i++) {
            for (int j = 0; j < matrixNames[i].length; j++) {
                System.out.printf(matrixNames[i][j]+"");
            }
            System.out.printf("%n");
        }

    }
}
