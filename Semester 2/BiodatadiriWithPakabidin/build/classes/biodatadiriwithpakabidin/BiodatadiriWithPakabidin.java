/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatadiriwithpakabidin;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BiodatadiriWithPakabidin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,nis,tempatlahir,tanggallahir,jeniskelamin,alamat,motto;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nama : ");
        nama = scan.nextLine();
        
        System.out.println("Masukkan Nis : ");
        nis = scan.nextLine();
        
        System.out.println("Masukkan Tempatlahir : ");
        tempatlahir = scan.nextLine();
        
        System.out.println("Masukkan Tanggallahir : ");
        tanggallahir = scan.nextLine();
        
        System.out.println("Masukkan  Jeniskelamin: ");
        jeniskelamin = scan.nextLine();
        
        System.out.println("Masukkan Alamat di malang : ");
        alamat = scan.nextLine();
        
        System.out.println("Masukkan Motto : ");
        motto = scan.nextLine();
        
        System.out.println("Nama		:" + nama);
        System.out.println("NIS		        : " + nis);
        System.out.println("Tempat lahir        :" + tempatlahir);
        System.out.println("Tanggal lahir       :" + tanggallahir);
        System.out.println("Jeniskelamin        : "+ jeniskelamin );
        System.out.println("Alamat dimalang     : " + alamat);
        System.out.println("Motto Hidup         :" + motto);
    

  
    }
    
}
