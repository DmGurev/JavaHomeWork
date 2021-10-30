package com.pb.gurev.hw5;

public class Library {
    public static void main (String [] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setBookTitle("Восточный экспресс");
        book1.setBookAuthor("А.Кристи");
        book1.setBookYear("1997");

        System.out.println(book1.getBook());



    }
    }
