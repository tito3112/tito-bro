package com;

import javax.swing.JOptionPane;

public class praktikum2 {
    public static void main(String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialog("Nama Anda : ");
        kota = JOptionPane.showInputDialog("Kota Anda : ");
        System.out.println("Selamat Datang "+ nama +" dari "+ kota);
        System.exit(0);
    }
}
