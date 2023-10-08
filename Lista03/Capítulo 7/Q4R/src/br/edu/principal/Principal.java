package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[10][20];
        int[] soma = new int[10];
        Scanner Scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {

                mat[i][j] = Scanner.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            soma[i] = 0;
            for (int j = 0; j < 20; j++) {
                soma[i] += mat[i][j];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j] *= soma[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
	}

}
