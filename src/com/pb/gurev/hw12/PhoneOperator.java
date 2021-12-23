package com.pb.gurev.hw12;
import com.pb.gurev.hw11.Adding;
import com.pb.gurev.hw11.PhoneNum;
import com.pb.gurev.hw11.PhoneOperator;
import com.pb.gurev.hw11.Serial;
import com.pb.gurev.hw11.FailedNumException;

import javax.sound.sampled.EnumControl;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PhoneOperator {
        public class Phone implements Serializable {
        private static final String REGEX_PHONE =
                "^\\+?[\\d\\s]+(\\-([\\d\\s]|[\\s]*(\\([\\d]+\\)[\\s]*))+)+$";
        private String num;

        public Num (String num) {
            try {
                correctNumber(num);
                this.num = num;
            } catch (FailedNumException e) {
                e.printStackTrace();
            }

        }

        private static void correct (String num) throws FailedNumException {
            boolean result = num.matches(REGEX_PHONE);
            if (!result) {
                String msg = String.format("Неверный номер: %s", num);
                throw new FailedNumException(msg);
            }
        }

        public String getPhoneOperator () {
            return num;
        }

        @Override
        public String toString() {
            return "телефон = " + num;
        }

    }
}
