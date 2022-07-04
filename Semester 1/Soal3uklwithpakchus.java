/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3uklwithpakchus;

/**
 *
 * @author USER
 */
public class Soal3uklwithpakchus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + "\t");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }

}
