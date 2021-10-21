package com.niit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(new String("1234"));
        String a = arrayList.get(0);//ép kiểu tường minh*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Luan");
        names.add("Nam");
        names.add("Linh");
        names.add("Le");

        names.remove(0);
        System.out.println(names.size()); //3

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));//lấy ra từng phần tử
        }

        names.add("Lam");
        names.add(0, "Lan Anh");


        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Luan");
        users.put(2, "Nam");
        users.put(3, "Linh");

        System.out.println(users.get(2));

        Set<Integer> keySet = users.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " - " + users.get(key));
        }

        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Iterator<Integer> itr = users.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(users.get(itr.next()));
        }


    }
}
