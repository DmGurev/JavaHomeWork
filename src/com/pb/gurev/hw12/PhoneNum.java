package com.pb.gurev.hw12;
import package com.pb.gurev.hw11.Adding;
import package com.pb.gurev.hw11.PhoneNum;
import package com.pb.gurev.hw11.PhoneOperator;
import  package com.pb.gurev.hw11.Serial;
import com.pb.gurev.hw11.WrongNumException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

    public class PhoneNum {
        private static List<Adding> addingList = new ArrayList<>();
        private static final String FILE_NAME = "save12.dat";

        public static void addAdding (Adding adding) {
            addingList.add(adding);
        }

        public static Adding getAddingIndex(int index) throws WrongNumException {
            if (index < 0) {
                String msg = String.format("Не найдено по индексу: %s", index);
                throw new WrongNumException(msg);
            }
            return addingList.get(index);
        }

        public static void searchAddingFio (String fio) {
            addingList.stream()
                    .filter(adding -> adding.getFio().equalsIgnoreCase(fio))
                    .limit(1)
                    .forEach(System.out::println);
        }

        public static void searchAddingNum (String phoneNum) {
            addingList.stream()
                    .filter(adding -> adding.getPhoneNum (phoneNum).equals(phoneNum))
                    .limit(1)
                    .forEach(System.out::println);

        }

        public static void saveAllToFile() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(addingList);
                System.out.println("Сохранено!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

        public static void loadAllFromFile() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                List<Adding> loadAddingdList = (List<Adding>) ois.readObject();
                System.out.println("Загружено!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        public static void print() {addingList.forEach(System.out::println);
        }

        public static void printFirstNElements(int n) {
            addingList.stream()
                    .limit(n)
                    .forEach(System.out::println);
        }
    }
}
