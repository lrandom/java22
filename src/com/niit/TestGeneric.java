package com.niit;

import com.niit.models.Human;
import com.niit.models.Person;
import com.niit.models.User;

import java.util.ArrayList;

public class TestGeneric {
    public void list(ArrayList<? super Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        TestGeneric testGeneric = new TestGeneric();
        ArrayList<Human> arrs = new ArrayList<>();
        arrs.add(new Human());
        arrs.add(new Human());
        testGeneric.list(arrs);

    }
}
