/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal4bburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal4bburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [][] = {{6,3},{4,8}};
        int b [][] = {{1},{2}};
        int h [][] = {{0},{0}};
        
        // Hasil A x B
        System.out.println("Hasil perhitungan");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 2; k++) {
                    h [i] [j] = h[i][j] + a [i][k] * b[k][j];
                }
            }
            
        }
        System.out.println("Menampilkan hasil");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(h[i][j] +"\t");
                
            }
            System.out.println();
        }
        
    }
    
}
