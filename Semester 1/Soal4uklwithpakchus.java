/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4uklwithpakchus;

/**
 *
 * @author USER
 */
public class Soal4uklwithpakchus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal = 3;
        int selisih = 5;
        int deret = awal;
        int total = awal;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + "\t");
               
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print("*" + "\t");
                deret += selisih;
                total += deret;
            }
            System.out.println();
        }
        System.out.println("\t");
        total -= deret;
        System.out.println("Jumlah totalnya adalah " + total);   
        System.out.println("\t");
    }
    
}
