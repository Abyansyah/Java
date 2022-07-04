/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal4aburatih;

/**
 *
 * @author USER
 */
public class Latihanuklsoal4aburatih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [][] = {{-7,5},{4,8}};
        int b [][] = {{1,1},{-4,9}};
        System.out.println("Hasil A - B");
        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] - b [i][j]);
            }
            System.out.println();
        }
    }
    
}
