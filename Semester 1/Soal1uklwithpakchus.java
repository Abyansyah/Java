/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1uklwithpakchus;

/**
 *
 * @author USER
 */
public class Soal1uklwithpakchus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal =9;
        int selisih = 6;
        int mulaisukuke = 19;
        int akhirsuku = 29;
        int deret = awal;
        int total = awal;
        
        for (int i = 1; i <= akhirsuku; i++) {
            total += deret;
            if (i >= mulaisukuke) {
                 System.out.println("Nilai suku ke - " + i + " Adalah " + deret);
                
                
            }
             deret += selisih;
        }
        System.out.println("Jumlah suku ke 19 sampai ke 39 adalah : " + total);
    }
}
