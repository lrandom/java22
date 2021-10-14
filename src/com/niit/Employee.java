package com.niit;

public class Employee {
    int age;

    public void setAge(int age) throws RuntimeException,Exception {
        if (age <= 0) {
            throw new RuntimeException("Tuoi khong the nho hon 0");
        }

        if (age > 120) {
            throw new Exception("Tuoi khong the lon hon 120");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
