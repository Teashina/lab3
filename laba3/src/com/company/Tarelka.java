package com.company;

abstract class Tarelka implements Dishes, Object{
    public int price;
    public String producer;
    public int diametr;

    public int getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public int getDiametr() {
        return diametr;
    }



    public Tarelka(int price, String producer, int diametr) {
        this.price = price;
        this.producer= producer;
        this.diametr=diametr;
    }


}
