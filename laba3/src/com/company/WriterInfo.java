package com.company;

public class WriterInfo {

    public static void main(String[] args) {
      Kastrylya kastrylya=new Kastrylya(4,500,true);
      Skovoroda s1=new Skovoroda("золото",12,100);
      Bludce b1=new Bludce(80,"Russia",40);
      Salatnitca salatnitca=new Salatnitca(60,"Belarus",30);

      kastrylya.print();
      kastrylya.color();
      s1.print();
      s1.color();
      b1.print();
      b1.color();
      salatnitca.print();
      salatnitca.color();

	}
}
