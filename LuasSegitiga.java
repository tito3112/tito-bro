package com;

public class LuasSegitiga {
    public static void main(String[] args) {
        double luas;

        Segitiga ls = new Segitiga();
        ls.alas = 12;
        ls.tinggi = 10;

        luas = 0.5*ls.alas*ls.tinggi;
        System.out.println("Luas segitiga = "+luas+"cm3");
    }
}
