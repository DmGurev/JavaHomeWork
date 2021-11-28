package com.pb.gurev.hw10;

public abstract class NumBox <T> extends Number{

    private final T[] numbers;
    int size;
    int index;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public T get(int index) {
        return numbers[index];
    }

    public void set(int index, T numbers) {
        this.numbers[index] = numbers;
    }

    public int length() {
        int count = 0;
        for (T i: numbers) {
            if (!(i == null)) {
                count++;
            } else count += 0;
        }
        return count;
    }

    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if (index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else  numbers[index] = num;
    }
    public double average() {
        return (sum(/length());
    }

    public double sum(double[]i) {
        double sum = 0.0;
        for (T i : numbers) {
            if (i == null) {
                sum+=0;
            } else
                sum+=i;
            }
        return sum;
    }

    public T max() {
        T maxValue = numbers[0];
        for (T number : numbers) {
            if (maxValue instanceof Integer) {
                if ((int) number > (int) maxValue)
                    maxValue = number;
            } else if (maxValue instanceof Float) {
                if ((float) number > (float) maxValue)
                    maxValue = number;
            } else if (maxValue instanceof Double) {
                if ((double) number > (double) maxValue)
                    maxValue = number;
            }
        }
        return maxValue;
    }

}
