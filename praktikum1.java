package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class praktikum1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new
        BufferedReader(new InputStreamReader(System.in));
        String nama, kota;
        System.out.println("Nama Anda : ");
        nama = br.readLine();
        System.out.println("Kota Asal : ");
        kota = br.readLine();
        System.out.println("Selamat Datang "+ nama +" dari "+ kota);
        
    }
}
