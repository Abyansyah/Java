/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoalwithburatihfinal;

/**
 *
 * @author USER
 */
public class Latihanuklsoalwithburatihfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [] [] = {{6, 3, 2}, {4,2,3}};
        int b [] [] = {{1, 2}, {2, 3}, {3, 1}};
        int h [] [] = {{0,0}, {0, 0}};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    h [i][j] = h[i][j] + a [i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println( h [i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int a [][] = {{-7,5},{4,8}};
//        int b [] [] = {{1,1}, {4, 9}};
//        int h [] [] = {{0}, {0}};
//        
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 1; j++) {
//                for (int k = 0; k < 1; k++) {
//                    h [i] [j] = h[i][j] + a [i][k] * b [j][k]; 
//                }
//                
//            }
//        }
//        
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 1; j++) {
//                System.out.print(h[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        
        
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(a[i][j] - b[i][j]);
//            }
//            System.out.println();
//        }
    }
}
