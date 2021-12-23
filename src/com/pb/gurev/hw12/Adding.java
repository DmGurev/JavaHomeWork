package com.pb.gurev.hw12;
import com.pb.gurev.hw11.Adding;
import com.pb.gurev.hw11.PhoneNum;
import com.pb.gurev.hw11.PhoneOperator;
import com.pb.gurev.hw11.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Adding {implements Serializable {
        private String fio;
        private LocalDate dateOfBirth;
        private List<PhoneNum> phoneList = new ArrayList<>();
        private String adress;
        private LocalDate datetimeEdit;

        private Adding () {
        }

        public String getFirstName() {
            return fio;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public List<PhoneNum> getPhoneList() {
            return phoneList;
        }

        public String getAdress() {
            return adress;
        }

        public LocalDate getDatetimeEdit() {
            return datetimeEdit;
        }

        public static Builder newBuilder() {
            return new Adding().new Adding();
        }

        public String getPhoneNum(String phoneNum) {
            return phoneList.stream()
                    .filter(list -> list.getPhoneNum().equals(phoneNum)
                    .map(add -> add.getPhoneNum())
                    .limit(1)
                    .collect(Collectors.joining());
        }

        @Override
        public String toString() {
            return "Запись{" +
                    "имя и фамилия = '" + fio + '\'' +
                    ", дата рождения = " + dateOfBirth +
                    ", телефон(ы) = " + phoneList +
                    ", адрес = '" + adress + '\'' +
                    ", дата и время редактирования = " + datetimeEdit +
                    '}';
        }

        public class Builder {

            private Builder() {
                setDatetimeEdit();
            }

            public Builder setFio (String fio) {
                Add.this.fio = fio;
                return this;
            }

            public Builder setDateOfBirth (int year, int month, int dayOfMonth) {
                Adding.this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
                return this;
            }

            public Builder setPhoneList(List<PhoneNum> phoneList) {
               Adding.this.phoneList = phoneList;
                return this;
            }

            public Builder setPhone(Phone phone) {
                phoneList.add(phone);
                return this;
            }

            public Builder setAdress(String adress) {
                Adding.this.adress = adress;
                return this;
            }

            private void setDatetimeEdit() {
               Adding.this.datetimeEdit = LocalDate.now();
            }

            public Adding build() {
                return Adding.this;
            }

        }
    }
}
