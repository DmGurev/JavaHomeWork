package com.pb.gurev.hw11;
import java.io.Serializable;
import com.pb.gurev.hw11.FailedNumException;

public class PhoneNum implements Serializable {
        private static final String REGEX_PHONE =
                "^\\+?[\\d\\s]+(\\-([\\d\\s]|[\\s]*(\\([\\d]+\\)[\\s]*))+)+$";
        private String num;

        public PhoneNum (String num) {
            try {
                correct (num);
                this.num = num;
            } catch (FailedNumException e) {
                e.printStackTrace();
            }
        }

        private static void correct (String num) throws FailedNumException {
            boolean result = num.matches(REGEX_PHONE);
            if (!result) {
                String msg = String.format("Неверный номер: %s", num);
                throw new FailedNumException (msg);
            }
        }

        public String getNum() {
            return num;
        }

    }
