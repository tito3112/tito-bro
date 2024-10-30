package com;

public class VolumeBalok {
    public static void main(String[] args) {
        double volume;

        Balok bl = new Balok();
        bl.panjang=7;
        bl.lebar=4;
        bl.tinggi=5;

        volume = bl.panjang*bl.lebar*bl.tinggi;
        System.out.println("Volume Balok ="+volume+ "Cm3");
    }
}