package com.pb.gurev.hw7;

import org.jetbrains.annotations.NotNull;

public class Atelier {
    public void main(String[] args){
        Pants pants = new Pants ("XXS Детский размер", 32, "белый", 400);
        Tshirt tshirt = new Tshirt ("XS Взрослый размер", 34, "серый", 450);
        Skirt skirt = new Skirt("S Взрослый размер", 36, "красный", 500);
        Tie tie = new Tie ("L Взрослый размер", 40, "черный",250);

        Clothes[]clothes= {pants, tshirt, skirt,  tie};
    }
    static void dressMan (Clothes @NotNull []clothes){
        System.out.println("Мужская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManClothes) {
                ((ManClothes) cloth).dressMan();
            }
        }
    }
    static void dressWomen (Clothes @NotNull []clothes){
        System.out.println("Женская одежда:");
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManClothes) {
                ((WomenClothes) cloth).dressWomen();
            }
        }
    }
}


