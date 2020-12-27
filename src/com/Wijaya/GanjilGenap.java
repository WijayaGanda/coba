package com.Wijaya;

import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {

        System.out.println("Operasi Ganjil Genap");

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka");
        int angka = input.nextInt();

        if (angka % 2 == 0){
            System.out.println("Angka : " + angka + " Adalah bilangan genap");
        }else {
            System.out.println("Angka : " + angka + " Adalah bilangan ganjil");
        }
    }
}
