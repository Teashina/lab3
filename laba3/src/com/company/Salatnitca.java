package com.company;

public class Salatnitca extends Tarelka implements Dishes, Object {
    String producer;
    public Salatnitca(int price, String producer,int diametr) {
        super(price, producer,diametr);
        this.producer = producer;
    }

    @Override
    public String getProducer() {
        return producer;
    }

    public void print(){
        System.out.println("САЛАТНИЦА");
        System.out.println("Производитель: " +this.getProducer()+" "+"Цена: "+getPrice()+" "+"Диаметр: "+getDiametr()+" "+"Стиль:"+style);
    };
    public void color(){
        System.out.println("Цвет салатницы: желтый");
    }
}
