package com.company;

public class Dog {
    private String name;
    private int age;
    private String colour;


    public Dog(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    public void getEat(){
        System.out.println("favorite dish meat");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColour(){
        return colour;
    }
}