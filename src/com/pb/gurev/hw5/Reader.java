package com.pb.gurev.hw5;

public class Reader {
    public String readerName;
    private String readerCardNum;
    private String readerFaculty;
    private String readerDateOfBirth;
    private String readerPhoneNum;
    private String readerBookQuantity;

    public Reader (String readerName, String readerCardNum, String readerFaculty,
                   String readerDateOfBirth, String readerPhoneNum, String readerBookQuantity)
    {
        this.readerName = readerName;
        this.readerCardNum = readerCardNum;
        this.readerFaculty = readerFaculty;
        this.readerDateOfBirth = readerDateOfBirth;
        this.readerPhoneNum = readerPhoneNum;
        this.readerBookQuantity = readerBookQuantity;
    }

    public String getReaderName (){
        return readerName;
    }
    public void setReaderName (String readerName){
        this.readerName = readerName;
    }

    public String getReaderCardNum (){
        return readerCardNum;
    }
    public void setReaderCardNum (String readerCardNum){
        this.readerCardNum = readerCardNum;
    }

    public String getReaderFaculty (){
        return readerFaculty;
    }
    public void setReaderFaculty (String readerFaculty){
    this.readerFaculty = readerFaculty;
    }

    public String getReaderDateOfBirth (){
        return readerDateOfBirth;
    }
    public void setReaderDateOfBirth (String ReaderDateOfBirth ){
        this.readerDateOfBirth = readerDateOfBirth;
    }

    public String getReaderPhoneNum (){
        return readerPhoneNum;
    }
    public void setReaderPhoneNum (String ReaderphoneNum){
        this.readerPhoneNum = readerPhoneNum;
    }


    public String getReaderBookQuantity (){
            return readerBookQuantity;
    }
    public void setReaderBookQuantity (String ReaderBookQuantity){
        this.readerBookQuantity = readerBookQuantity;
    }

  // TAKE BOOK

        public void takeBook (String readerName) {
            System.out.println(readerName + "взял книг: 1");
        }
        public void takeBook (String readerName, String bookTitle, String bookAuthor) {
        System.out.println(readerName + "взял книг: 1" + bookTitle + bookAuthor);
        }
        public void takeBook (String readerName, String bookTitle, String bookAuthor, String bookYear) {
        System.out.println(readerName + "взял книг: 1" + bookTitle + bookAuthor+ ",  год издания:  " +bookYear);
    }

/*
    public void takeBook(String readerName, String bookTitle) {
        System.out.println(readerName + "взял книг: 3" + bookTitle);
    }
    public void takeBook(String readerName, String bookTitle, String bookAuthor) {
        System.out.println(readerName + "взял книг: 3" + bookTitle + bookAuthor);
    }





*/

    public String getReader() {
        return "Студент: " + readerName + ", читательский билет: " + readerCardNum +
                ", факультет: " + readerFaculty +", дата рождения: " + readerDateOfBirth +
                ", номер телефона: " + readerPhoneNum;
    }
}












