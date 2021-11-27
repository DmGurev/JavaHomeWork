package com.pb.gurev.hw10;

//import s02nogenerics.Car;
//import s02nogenerics.Motorcycle;

public class Main {

    public static void main(String[] args) {
        public static void show(NumBox<?> box){
            System.out.println(box);
            System.out.println("Сумма: "+box.sum());
            System.out.println("Размер "+box.length());
            System.out.println("Среднее значение " +box.average());
            int index = (int) (Math.random()*box.length());
            System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));
            System.out.println("Максимум "+box.max());
        }
