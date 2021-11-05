package com.pb.gurev.hw6;

public class Animal{

    //переменные:
    private String food;
    private String location;

    public String getFood() {
       return food;
    }
    public void setFood (String food){
      this.food = food;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation (String location){
        this.location = location;
    }

    //методы:
    public void makeNoise (String makeNoise){
        System.out.println("Кот мяукает, собака лает, конь ржёт");
    }

    public void eat(String eat) {

    }

    public void sleep(String sleep) {

    }

}