package com.niit;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*FileInputStream fis;
        BufferedInputStream bufferedInputStream;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i = 0;*/
/*        try {
            //win - fis = new FileInputStream("C:\\Users\\lrandom\\Desktop/note.txt");
            fis = new FileInputStream("/Users/lrandom/Desktop/note.txt");
            bufferedInputStream = new BufferedInputStream(fis);
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }*/

       /* try {
            fileReader = new FileReader("/Users/lrandom/Desktop/note.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line=bufferedReader.readLine())!=null) {
                System.out.print(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }*/


        FileOutputStream fos;

        try {
            fos = new FileOutputStream("/Users/lrandom/Desktop/note.txt",false);
            fos.write(new String("ABCDEF").getBytes());
            fos.close();
        } catch (Exception e) {

        }
    }
}
