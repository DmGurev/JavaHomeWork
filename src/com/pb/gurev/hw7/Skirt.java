package com.pb.gurev.hw7;

public class Skirt extends Clothes implements WomenClothes{
    @Override
    public void dressWomen() {
    }
    public Skirt (String size, int eurosize, String colour, int price) {
        this.size = size;
        this.eurosize = eurosize;
        this.colour = colour;
        this.price = price;
    }
}


