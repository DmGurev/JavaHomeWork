package com.pb.gurev.hw11;
import com.pb.gurev.hw11.WrongNumException;
import com.pb.gurev.hw11.PhoneNum;
import com.pb.gurev.hw11.PhoneOperator;
import com.pb.gurev.hw11.Adding;
public class Serial {
        public static void main(String[] args) throws WrongNumException {
            Phonebook phonebook = new Phonebook();
            Num num = new Num ("068 244 44 44");
            Adding adding1 = Adding.newBuilder()
                    .setAdress("город Николаев")
                    .setDateOfBirth (1990, 1, 2)
                    .setFio("Андрей Семенов")
                    .setNum(num)
                    .build();

            Adding adding2 = Adding.newBuilder()
                    .setAdress("город Винница")
                    .setDateOfBirth (1991, 1, 3)
                    .setFio("Игорь Иванов")
                    .setNum(num)
                    .build();

            Adding adding3 = Adding.newBuilder()
                    .setAdress("город Одесса")
                    .setDateOfBirth (1992, 1, 4)
                    .setFio("Павел Сергеев")
                    .setNum(num)
                    .build();

            Phonebook.addAdding(adding1);
            Phonebook.addAdding(adding2);
            Phonebook.addAdding(adding3);

            phonebook.print();

            System.out.println("Внесение по индексу");
            Adding adding = Phonebook.getAddingIndex(0);
            System.out.println(adding);

            System.out.println("Внесение по фамилии");
            Adding addFio = Phonebook.getAddFio ("Романов");
            System.out.println(addFio);

            System.out.println("Внесение по номеру телефона");
            Adding addPhone = Phonebook.getAddingPhone("0960003625");
            System.out.println(addPhone);

            System.out.println("Сохранение данных");
            Phonebook.saveAllToFile();

            System.out.println("Получение данных");
            Phonebook.loadAllFromFile();

        }
    }
