/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal7uklwithpakchus;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Soal7uklwithpakchus {

    static String kategori(int gaji) {
        String kategori = "";

        if (gaji > 10000000) {
            kategori = "C";
        } else if (gaji >= 2000000) {
            kategori = "B";
        } else if (gaji < 2000000) {
            kategori = "A";
        }
        return kategori;
    }

    static int biaya(String jalur, String kategori, int bulan) {
        int biaya = 0;
        if (jalur.equalsIgnoreCase("SBMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 5000000 + (500000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 15000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 30000000 + (2000000 * bulan);
            }
        } else if (jalur.equalsIgnoreCase("SNMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 7000000 + (500000 * bulan);
            } else if (jalur.equalsIgnoreCase("B")) {
                biaya = 17000000 + (1000000 * bulan);
            } else if (jalur.equalsIgnoreCase("C")) {
                biaya = 35000000 + (2000000 * bulan);
            }

        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 10000000 + (1000000 * bulan);
            } else if (jalur.equalsIgnoreCase("B")) {
                biaya = 25000000 + (2000000 * bulan);
            } else if (jalur.equalsIgnoreCase("C")) {
                biaya = 50000000 + (3000000 * bulan);
            }

        }
        return biaya;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id, gaji, bulan;

        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "MANDIRI", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan id : ");
        id = scan.nextInt();

        System.out.println("Masukkan pendapatan : ");
        gaji = scan.nextInt();

        System.out.println("Masukkan jumlah bayar spp : ");
        bulan = scan.nextInt();

        System.out.println("Id Mahasiswa        : " + id);
        System.out.println("Nama Mahasiswa      : " + nama[id - 1]);
        System.out.println("Jalur Masuk         : " + jalur[id - 1]);
        System.out.println("Kategori Pendapatan : " + kategori(gaji));
        System.out.println("Biaya               : " + biaya(jalur[id - 1], kategori(gaji), bulan));
        System.out.println("Alamat              : " + alamat[id - 1]);
    }

}
