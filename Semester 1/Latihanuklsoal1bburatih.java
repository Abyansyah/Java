/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal1bburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal1bburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal = 5;
        int selisih = 5;
        int mulaisukuke = 3;
        int sukuterakhir = 10;
        int deret = awal;
        int total = 0;
        
        System.out.println("Aritmatika ");
        
        for (int i = 1; i <= sukuterakhir; i++) {
            if (i >= mulaisukuke) {
                System.out.println("Suku ke - " + i +" adalah "+ deret);
                total += deret;
            }
            deret += selisih;
        }
        System.out.println("Jumlah suku ke 1 hingga suku ke 10 adalah : " + total);
    }
    
}
