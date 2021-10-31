package com.pb.gurev.hw5;

public class Library {
   public static void main (String [] args) {
        Book book1 = new Book("'Восточный экспресс'", "А.Кристи","1997");
        Book book2 = new Book("'Война миров'","Г.Уэллс", "1985");
        Book book3 = new Book("'Зверобой'", "Д.Ф.Купер", "1981");

        book1.setBookTitle("'Восточный экспресс'");
        book1.setBookAuthor("А.Кристи");
        book1.setBookYear("1997");

      book2.setBookTitle("'Война миров'");
      book2.setBookAuthor("Г.Уэллс");
      book2.setBookYear("1985");

     book3.setBookTitle("'Зверобой'");
     book3.setBookAuthor("Д.Ф.Купер");
     book3.setBookYear("1981");

       System.out.println(book1.getBook());
       System.out.println(book2.getBook());
       System.out.println(book3.getBook());
       Book[] books = {book1,book2,book3};
       for (Book a:books) {
        }
       Reader reader1 = new Reader ("Иваненко Д.М.", "001","Химия и Биология",
               "01.02.2004 г.р.", "066000001","1"  );

       System.out.println(reader1.getReader());

        reader1.setReaderName("Иваненко Д.М.");
        reader1.setReaderCardNum ("001");
        reader1.setReaderFaculty("Химия и Биология");
        reader1.setReaderDateOfBirth ("01.02.");
        reader1.setReaderPhoneNum("066000001");
        reader1.setReaderBookQuantity("1");
       // reader1.setReaderBookQuantity("1");

       {
        //   Reader.takeBook("Иваненко Д.М.");
       }
   }
}


