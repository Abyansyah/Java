/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5uklwithpakchus;

/**
 *
 * @author USER
 */
public class Soal5uklwithpakchus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = {{1, 2, 3, 4, 5}, {4, 5, 6, 7}, {7, 8, 9}, {2, 3, 4}, {7, 8, 9}};//a:3 b:6
        int b[][] = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}, {7, 8, 9}, {7, 8, 9}};//A:baris b:kolom=samping

        for (int i = 0; i < 5; i++) { //kolom 
            for (int j = 0; j < 3; j++) { //baris
                a[i][j] = a[i][j] + b[i][j];//perhitungan // misal awal bisa pakai a atau b
                System.out.print(a[i][j] + "\t");// \t:tab //menampilkan perulangan
            }
            System.out.println();
        }
    }
    
}
