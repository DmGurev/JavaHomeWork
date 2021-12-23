package com.pb.gurev.hw12;
import com.pb.gurev.hw11.*;
import com.pb.gurev.hw11.PhoneNum;
import com.pb.gurev.hw11.PhoneOperator;
import com.pb.gurev.hw11.Serial;

public class Serial {
        public static void main(String[] args) throws WrongNumException {
            Phonebook phonebook = new Phonebook();
            Num num = new Num ("+38 073 123-45-67");
            Adding adding1 = Adding.newBuilder()
                    .setAdress("город Николаев")
                    .setDateOfBirth (1990, 1, 2)
                    .setFio("Андрей Семенов")
                    .setNum(num)
                    .build();

            com.pb.gurev.hw11.Adding adding2 = com.pb.gurev.hw11.Adding.newBuilder()
                    .setAdress("город Винница")
                    .setDateOfBirth (1991, 1, 3)
                    .setFio("Игорь Иванов")
                    .setNum(num)
                    .build();

            com.pb.gurev.hw11.Adding adding3 = com.pb.gurev.hw11.Adding.newBuilder()
                    .setAdress("город Одесса")
                    .setDateOfBirth (1992, 1, 4)
                    .setFio("Павел Сергеев")
                    .setNum(num)
                    .build();


            Phonebook.addAdding(adding1);
            Phonebook.addAdding(adding2);
            Phonebook.addAdding(adding3);


            phonebook.print();

            System.out.println("-- Запись по индексу");
           Adding adding = Phonebook.getAddingIndex(0);
            System.out.println(adding);

            System.out.println("-- Запись по фамилии (Stream)");
            Phonebook.searchAddingFio("Андрей Семенов");

            System.out.println("Запись по номеру телефона (Stream)");
            Phonebook.searchAddingNum ("+38 073 123-45-67");

            System.out.println("Сохраняем данные в файл");
            Phonebook.saveAllToFile();

            System.out.println("-- Получаем данные из файла");
            Phonebook.loadAllFromFile();

            System.out.println("-- Печать первых двух элементов (Stream)");
            Phonebook.printFirstNElements(2);
        }
    }
