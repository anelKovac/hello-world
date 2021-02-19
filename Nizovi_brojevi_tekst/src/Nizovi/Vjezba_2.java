package Nizovi;

import java.util.Arrays;

/**
 * Program koji sabira dvije matrice
 *
 * Matrice se sabiraju tako da se svaki clan jedne matrice sabira sa clanom druge matrice na istoj poziciji
 * npr.
 * 1 2 3     4 1 6      1+4 2+1 3+6
 * 5 6 7  +  2 3 5  =   5+2 6+3 7+5
 * 9 0 1     7 4 3      9+7 0+4 1+3
 *
 */
class Vijezba_2 {
    public static void main(String[] args) {
        int[][] matrica1 = {{1, 2, 3}, {5, 6, 7}, {9, 0, 1}};
        int[][] matrica2 = {{4, 1, 6}, {2, 3, 5}, {7, 4, 3}};
        int[][] matricaSum = saberiMatrice(matrica1, matrica2, matrica1.length, matrica2.length);
        for(int i = 0; i < matricaSum.length; i++){
            for(int j = 0; j < matricaSum[i].length; j++){
                System.out.print(matricaSum[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] saberiMatrice(int[][] matrica1, int[][] matrica2, int matrica1lenght, int matrica2lenght){
        int[][] matrica= new int[matrica1lenght][matrica2lenght];
        for(int i = 0; i < matrica1.length; i++){
            for(int j = 0; j < matrica2.length; j++){
                matrica[i][j] = matrica1[i][j] + matrica2[i][j];
            }
         }
        return matrica;
    }



}
