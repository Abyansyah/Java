/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal22uklwithpakchus;

/**
 *
 * @author USER
 */
public class Soal22uklwithpakchus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = {{5}, {3}};
        int b[][] = {{3}, {5}};
        int baris_a = a.length;
        int kolom_a = a[0].length;

        int baris_b = b.length;
        int kolom_b = b[0].length;
        int h;
        System.out.println("Hasil AxB");
        //proses perhitungan
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                h = 0;
                for (int k = 0; k < kolom_a; k++) {
                    h[i][j] = a[i][k] * b[k][j];
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(h[i][j]);
            }
        }

    }

}
