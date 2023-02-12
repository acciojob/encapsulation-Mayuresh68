package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("mayuresh_patil");
        System.out.println(obj.getName());

        RWOnly obj1 = new RWOnly();
        obj1.setName("lets try...");
        System.out.println(obj1.getName());

        obj.setNum(50);
        System.out.println(obj.getNum());
    }
}