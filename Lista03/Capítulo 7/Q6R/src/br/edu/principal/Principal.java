package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[][] a = new int[4][5];
        int[][] b = new int[5][2];
        int[][] c = new int[4][2];

        int i, j, k, soma, mult;
        
        System.out.println("Matriz 4x5");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Digite o valor de a[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 5x2");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Digite o valor de b[" + (i + 1) + "][" + (j + 1) + "]: ");
                b[i][j] = scanner.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
            for (k = 0; k < 2; k++) {
                soma = 0;
                for (j = 0; j < 5; j++) {
                    mult = a[i][j] * b[j][k];
                    soma += mult;
                }
                c[i][k] = soma;
            }
        }
        System.out.println("\nProduto Matricial: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

	}
}
