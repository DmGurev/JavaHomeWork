package com.pb.gurev.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> ArrBox1 = new NumBox<Integer>(4) {
            @Override
            public int intValue() {
                return 0;
            }
            @Override
            public float floatValue() {
                return 0;
            }
            @Override
            public double doubleValue() {
                return 0;}
        };
        try {
            ArrBox1.add(0,6);
            ArrBox1.add(1, 7);
            ArrBox1.add(2, 8);
            ArrBox1.add(3, 9);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It is impossible to pad the array. The array is overflowed. Array length -" + ArrBox1.get(ArrBox1.size));
            e.printStackTrace();
        }
        System.out.println(ArrBox1.index);
        System.out.println(ArrBox1.average());
        System.out.println(ArrBox1.length());
        System.out.println(ArrBox1.size);
        System.out.println(ArrBox1.get(1));

        NumBox<Float> ArrBox2 = new NumBox<Float>(7) {
            @Override
            public int intValue() {
                return 0;
            }
            @Override
            public float floatValue() {
                return 0;
            }
            @Override
            public double doubleValue() {
                return 0;
            }
        };
        try {
            ArrBox2.add(0, 3.33F);
            ArrBox2.add(1, 4.44F);
            ArrBox2.add(2, 5.55F);
            ArrBox2.add(3, 6.66F);
            ArrBox2.add(4, 7.77F);
            ArrBox2.add(4, 8.88F);
            ArrBox2.add(4, 9.99F);

        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("It is impossible to pad the array. The array is overflowed. Array length -" + ArrBox2.get(ArrBox2.size));
            e2.printStackTrace();
        }
        System.out.println(ArrBox2.size);
        System.out.println(ArrBox2.length());
        System.out.println(ArrBox2.get(2));
        System.out.println(ArrBox2.average());
        System.out.println(ArrBox2.index);
        System.out.println(ArrBox2.max());
        System.out.println(ArrBox2.sum());
    }
}