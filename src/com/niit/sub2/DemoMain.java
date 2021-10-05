package com.niit.sub2;

import com.niit.Human;
import com.niit.sub.Asia;

public class DemoMain {
    public static void main(String[] args) {
        Asia human = new Asia();
        System.out.println(human.hairColor);
        System.out.println(human.name);//cũng được

        AbCar abCar = new AbCar() {
            @Override
            public void stop() {
                ///
            }
        };


    }
}
