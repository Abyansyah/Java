/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal2aburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal2aburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // soal matrix 4 x 5

        int awal = 3;
        int selisih = 7;
        int deret = awal;
        int total = awal;

        for (int i = 0; i < 4; i++) { // baris 
            for (int j = 1; j < 5; j++) { // kolom
                System.out.print(deret + "\t");
                deret += selisih;
                total += deret;

            }
            System.out.println();
        }
        total -= deret;
        System.out.println("Jumlah nilai deret aritmatika di atas adalah " + total);
    }

}
