package com.niit;

public class Human {

    String name;
    String eyeColor;
    String hairColor;
    float height;
    float weight;
    String faceDescription;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String eyeColor, String hairColor) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public Human(String name,
                 String eyeColor,
                 String hairColor,
                 float height,
                 float weight,
                 String faceDescription) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.faceDescription = faceDescription;
    }

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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFaceDescription() {
        return faceDescription;
    }

    public void setFaceDescription(String faceDescription) {
        this.faceDescription = faceDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " eating");
    }

    public void sleep() {

    }

    public void study() {

    }
}
