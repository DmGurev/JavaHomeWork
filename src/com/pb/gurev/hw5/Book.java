package com.pb.gurev.hw5;

public class Book {
    public  String bookTitle;
    private String bookAuthor;
    private String bookYear;

    public Book (String bookTitle, String bookAuthor, String bookYear){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookTitle (){
        return bookTitle;
    }
    public void setBookTitle (String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor () {
        return bookAuthor;
    }
    public void setBookAuthor (String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear (){
        return bookYear;
    }
    public void setBookYear (String bookYear){
        this.bookYear = bookYear;
    }

    String getBook (){
        return "[ Название книги:" + bookTitle + ", автор:" + bookAuthor + ", год издания:" + bookYear+" ]";
    }
}



