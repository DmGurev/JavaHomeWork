package com.pb.gurev.hw7;

public class Tshirt  extends Clothes implements ManClothes, WomenClothes{
    @Override
    public void dressMan() {
    }
    @Override
    public void dressWomen() {
    }
    public Tshirt  (String size, int eurosize, String colour, int price) {
        this.size = size;
        this.eurosize = eurosize;
        this.colour = colour;
        this.price = price;
    }
}

