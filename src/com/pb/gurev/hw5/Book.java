package com.pb.gurev.hw5;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookYear;

    public String getBookTitle (){
        return bookTitle;
    }
    public void setBookTitle (String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor (){
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
        return "[Название книги:" + bookTitle + "Автор:" + bookAuthor + "Год выпуска:" + bookYear+"]";
    }
}



