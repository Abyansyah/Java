/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal3aburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal3aburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Matrix 5 
        int awal = 5;
        int selisih = 3;
        int deret = awal;
        int total = awal;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(deret + "\t");

            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(deret + "\t");
                if (i == j) {
                    break;
                }

            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * " + "\t");
                
            }
            System.out.println();
        }
        
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"+"\t");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
        
        System.out.println("=======================================");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("*"+"\t");
                deret += selisih;
                total += deret;
            }
            System.out.println();
        }

    }

}
