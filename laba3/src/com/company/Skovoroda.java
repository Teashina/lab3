package com.company;

public class Skovoroda implements Dishes,Object{
    public String pokr;
    public int length;
    public int price;


    public Skovoroda(String pokr, int length, int price) {
        this.pokr = pokr;
        this.length = length;
        this.price = price;

    }

    public String getPokr() {
        return pokr;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }


    public void print(){
        System.out.println("СКОВОРОДА");
   System.out.println("Покрытие: " +getPokr()+" "+"Длина ручки: "+getLength()+" "+"Цена: "+getPrice()+" "+"Стиль:"+style);
    };
    public void color(){
        System.out.println("Цвет сковородки: белый");
    }

}
