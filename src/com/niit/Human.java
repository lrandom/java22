package com.niit;
//SOLID
public class Human {
    private String eyeColor;
    public String hairColor;
    public String name;

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void sayEyeColor() {
        System.out.println("Eye color is " + this.eyeColor);
    }
}
