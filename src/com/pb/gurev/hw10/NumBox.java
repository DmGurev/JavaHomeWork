package com.pb.gurev.hw10;

public class NumBox <T extends  Number> {
    private final T [] numbers;

    public NumBox (int size){
        numbers = (T[]) new Number [size];
        int[] array = new  int[3];
        int[] ints = {5, 6, 7,};
    }
    public T get (int index) {
            return numbers[index];}
    public void set (int index, T numbers){
            this.numbers [index] = numbers;
    }

    public void add (T t) throws Exception{
        if(this.filled >this.numbers.length) {
            throw new Exception
                    ("Массив заполнен");
            this.numbers(this.filled) = t;
            this.filled++;
        }

        numbers.add(t);
    }


    }

    public Number (int size){
        for (T t : numbers = (T[]) new Number[]) {

        }


        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};
    int max = list[0];

    public NumBox(T[] numbers) {
    }
        for (int i = 0; i < arr.length; i++) {
        arr[i] = arr.nextFloat();

//    private T vehicle;
////
//    public T get() {
//        return vehicle;
//    }
//
//    public void set(T vehicle) {
//        this.vehicle = vehicle;
//    }
public int lenth (Object [] [] ){

    public double average(){
        double sum = 0.0;
        for (T i : numbers) {
            if (i == null){
                sum+=0;
            } else sum+=i.double.Value();
        }
        return sum;


    public double sum() {
    double sum = 0.0;
    for (T i : numbers) {
        if (i == null){
            sum+=0;
        } else sum+=i.double.Value();
    }
    return sum;

    public T max() {
        T maxValue = arr.get(0);
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).doubleValue() > maxValue.doubleValue())
                maxValue = arr.get(i);
        }



    }
    }
}
}

    public NumBox(T[] numbers) {
        this.numbers = numbers;
    }