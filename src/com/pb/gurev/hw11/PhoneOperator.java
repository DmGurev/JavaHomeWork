package com.pb.gurev.hw11;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhoneOperator implements Serializable {
    private String fio;
    private LocalDate dateOfBirth;
    private List<Serial> phoneList = new ArrayList<>();
    private String adress;
    private LocalDate datetimeEdit;

    private Adding() {
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Serial> getNumList() {
        return phoneList;
    }

    public String getAdress() {
        return adress;
    }

    public LocalDate getDatetimeEdit() {
        return datetimeEdit;
    }

    public static Builder newBuilder() {
        return new Adding().new Builder();
    }

    @Override
    public String toString() {
        return "Вносим { ",  +
                "имя и фамилия = " + fio + '\'' +
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

        public Builder setFio(String fio) {
            if (fio == null) {
                throw new IllegalArgumentException("Значение не может быть \"null\"");
            }
            Adding.this.lastName = fio;
            return this;
        }

        public Builder setDateOfBirth(int year, int month, int dayOfMonth) {
            Adding.this.DateOfBirth = LocalDate.of(year, month, dayOfMonth);
            return this;
        }

        public Builder setPhoneList(List<Serial> phoneList) {
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
            return  Adding.this;
        }
    }
}

