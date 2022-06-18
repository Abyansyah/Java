/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal2bburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal2bburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal = 10;
        int selisih = 5;
        int deret = awal;
        int total = awal;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(deret+"\t");
                deret += selisih;
                total += deret;
            }
            System.out.println();
        }
        total -= deret;
        System.out.println("Jumlah nilai deret aritmatika di atas adalah " + total);
        
    }
    
}
