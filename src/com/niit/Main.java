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


/*        FileOutputStream fos;
        BufferedOutputStream bufferedOutputStream;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;*/
        /*
        try {
            fos = new FileOutputStream("/Users/lrandom/Desktop/note.txt",false);
            bufferedOutputStream = new BufferedOutputStream(fos);
            bufferedOutputStream.write(new String("ABCDEF").getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fos.close();
        } catch (Exception e) {

        }*/
/*
        try {
            fileWriter = new FileWriter("/Users/lrandom/Desktop/note.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello, java web 22");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
        } catch (Exception e) {

        }*/


    /*    File file = new File("/Users/lrandom/Desktop/vue/sub");
        if (!file.exists()) {
            file.mkdir();
        }*/
        //0775 - > read write execute : đọc ghi thực thi
                  // 4     2     1 =  5

        //chown : user, group user, everybody
        //chmod trong linux/unix

   /*     File files[] = file.listFiles();
        for (int i = 0; i < files.length ; i++) {
            System.out.println(files[i].getName());
        }*/



        //GHI VÀO MỘT OBJECT
        try {
            FileOutputStream fos = new FileOutputStream("/Users/lrandom/Desktop/vue/sub/user.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            User user = new User();
            user.setName("Luan");
            user.setId("001");
            obj.writeObject(user);
            obj.close();
            fos.close();
        } catch (Exception e) {

        }

        try {
            FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/vue/sub/user.dat");
            ObjectInputStream obj = new ObjectInputStream(fis);
            User user = (User) obj.readObject();
            System.out.println(user.getName());
            System.out.println(user.getId());
            obj.close();
            fis.close();
        } catch (Exception e) {

        }
    }
}
