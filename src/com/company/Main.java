package com.company;

public class Main {

    public static void main(String[] args) {
        CatBox Box1 = new CatBox(10,10,10);
        CatBox Box2 = new CatBox(30,25,10);

        int vol;
        vol = Box1.getVolume();
        System.out.println("объём первой коробки: " + vol);

        vol = Box2.getVolume();
        System.out.println("объём второй коробки: " + vol);

        Box2.setDim(25,20, 10);
        vol = Box2.getVolume();
        System.out.println("изменения объёма второй коробки: " + vol);
    }
}
