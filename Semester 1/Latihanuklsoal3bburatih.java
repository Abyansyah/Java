/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal3bburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal3bburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int awal = 5;
        int selisih = 3;
        int deret = awal;
        int total = awal;

        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + "\t");

            }
            System.out.println();
        }
        System.out.println("\n");
        
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5 - i ; j++) {
                System.out.print("*" + "\t");

            }
            System.out.println();
        }
    }
    
}
