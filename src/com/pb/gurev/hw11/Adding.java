package com.pb.gurev.hw11;

import com.pb.gurev.hw11.WrongNumException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

    public class Adding {
        private static final List<Adding> addingList = new ArrayList<>();
        private static final String FILE_NAME = "newnums.dat";

        public static void addAdding (Adding adding) {
            addingList.add(adding);
        }

        public static Adding getAddingIndex(int index) throws WrongNumException {
            if (index < 0) {
                String msg = String.format("Не определено: %s", index);
                throw new WrongNumException(msg);
            }
            return addingList.get(index);
        }

        public static Adding getAddingFio(String fio) throws WrongNumException {
            int index = searchAddingFio(fio);
            if (index < 0) {
                String msg = String.format("Не найдено по фамилии: %s", fio);
                throw new WrongNumException(msg);
            }
            return addingList.get(index);
        }

        public static Adding getAddingNum(String num) throws WrongNumException {
            int index = searchAddingFio (num);
            if (index < 0) {
                String msg = String.format("Не найдено по номеру телефона: %s", num);
                throw new WrongNumException(msg);
            }
            return addingList.get(index);
        }

        public static int searchAddingFio (String fio) {
            int lenth = addingList.size();
            for (int i = 0; i < lenth; i++) {
                Adding resultAdd = addingList.get(i);
                String resultAddFio
                public static int searchAddingFio (String fio) {
                    int lenth = addingList.size();
                    for (int i = 0; i < lenth; i++) {
                        Adding resultAdding = addingList.get(i);
                        String resultAddAddingFio = resultAdd.getAddingFio();
                        if (resultAddFio.equals(fio)) {
                            return i;
                if (resultAddFio.equals(fio)) {
                    return i;
                }
            }
            return -1;
        }


        public static int searchAddingFio(String fio) {
            int lenth = addingList.size();
            for (int i = 0; i < lenth; i++) {
               Adding resultAdding = addingList.get(i);
                String resultGetAddingFio = resultAdd.getAddingFio();
                if (resultAddFio.equals(fio)) {
                    return i;
                    }
                }
            }
            return -1;
        }

        public static void saveAllToFile() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(addingList);
                System.out.println("Сохранено в файл... OK!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

        public static void loadAllFromFile() {
            List<Adding> loadAddingList = new ArrayList<>();
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                loadAddingList = (List<Adding>) ois.readObject();
                System.out.println("Загружено из файла");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        public static void print(); {
            for (Adding adding :addingList) {
                System.out.println(adding);
            }
        }
    }