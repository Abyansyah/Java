/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal1aburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal1aburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal = 7;
        int selisih = 10;
        int sukuawal = 15;
        int sukuakhir = 20;
        int deret = awal;
        int total = awal;
        
        for (int i = 1; i <= sukuakhir; i++) {
            
            if (i >= sukuawal) {
                System.out.println("Nilai suku ke - " + i + " = " + deret);
                total += deret;
            }
            deret += selisih;
          
        }
         System.out.println("Jumlah suku ke 1 hingga suku ke 20 adalah : " + total);
    }
    
}
