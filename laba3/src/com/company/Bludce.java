package com.company;

public class Bludce extends Tarelka  {
    String producer;
    public Bludce(int price, String producer, int diametr) {
        super(price, producer, diametr);
        this.producer = producer;
    }


    public String getProducer() {
        return producer;
    }


    public void print(){
        System.out.println("БЛЮДЦЕ");
        System.out.println("Производитель: " +getProducer()+" "+"Цена: "+getPrice()+" "+"Диаметр : " +getDiametr()+" "+"Стиль:"+style);
    };
    public void color(){
        System.out.println("Цвет блюдца: красный");
    }
}
