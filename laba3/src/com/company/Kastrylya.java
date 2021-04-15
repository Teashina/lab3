package com.company;

public class Kastrylya implements Dishes,Object{

  public int depth;
  public int price;
  boolean krushka;
  public String producer;

    public Kastrylya( int depth, int price,boolean krushka) {
    this.krushka=krushka;
        this.depth = depth;
        this.price = price;
    }

    public boolean isKrushka() {
        return krushka;
    }

    public int getDepth() {
        return depth;
    }

    public int getPrice() {
        return price;
    }

    public void print(){
        System.out.println("КАСТРЮЛЯ");
    System.out.println("Объем: "+getDepth()+" "+"Цена: "+getPrice()+" "+"Наличие крышки: "+isKrushka()+" "+"Стиль: "+style);
    }



    public void color(){
       System.out.println("Цвет кастрюли: серый");
    };
}
