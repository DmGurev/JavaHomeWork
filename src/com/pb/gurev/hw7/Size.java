package com.pb.gurev.hw7;

public enum Size {
        XXS,
        XS,
        S,
        M,
        L;
    String description;
    int euroSize;
        Size XXS = new Size("XXS Детский размер",32);
        Size XS = new Size("XS Взрослый размер",34);
        Size S = new Size("S Взрослый размер",36);
        Size M = new Size("M Детский размер",38);
        Size L = new Size("L Взрослый размер", 40);

        Size(String description,int euroSize ){
            this.description = description;
            this.euroSize = euroSize;
        }

    String getDescription() { //возврат description
            return description;
        }
        int getEuroSize() { //возврат euroSize;
            return euroSize;
        }
    }
