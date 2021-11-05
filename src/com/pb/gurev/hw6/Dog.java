package com.pb.gurev.hw6;

public class Dog extends Animal{
    @Override
    public String getFood() {
        return super.getFood();
    }

    public String dogNick;
    public String dogBreed;
    public String dogLocation;
    public String dogFood;

    public Dog (String dogNick, String dogBreed, String dogLocation, String dogFood){
        this.dogNick = dogNick;
        this.dogBreed = dogBreed;
        this.dogLocation = dogLocation;
        this.dogFood = dogFood;
    }

    public String getDogNick (){return dogNick;}
    public void setDogNick (String dogNick){this.dogNick = dogNick;}

    public String getDogBreed (){return dogBreed;}
    public void setDogBreed (String dogBreed){this.dogNick =dogBreed;}

    public String getDogLocation (){return dogLocation;}
    public void setDogLocation (String dogLocation){this.dogLocation =dogLocation;}
}










