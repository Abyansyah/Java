/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklsoal41buratihmatrix;

/**
 *
 * @author USER
 */
public class Latihanuklsoal41buratihmatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal = 5;
        int s = 3;
        int deret = awal;
        int total = awal;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(deret + "\t");
                deret += s;
                total += deret;
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(deret + "\t");
                deret += s;
                total += deret;
            }
            System.out.println();
        }
    }

}
