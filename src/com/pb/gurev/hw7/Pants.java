package com.pb.gurev.hw7;

import java.time.LocalDate;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    @Override
    public void dressMan() {
    }
    @Override
    public void dressWomen() {
    }
    public Pants  (String size, int eurosize, String colour, int price) {
        this.size = size;
        this.eurosize = eurosize;
        this.colour = colour;
        this.price = price;
    }
}

