package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 int[][] mat = new int[5][4];
	        int i, j, num, r;
	        int lin_p = 2, col_p = 0, lin_i = 1, col_i = 0, tot = 0;
	        Scanner scanner = new Scanner(System.in);
	        do {
	            if (tot != 20) {
	                System.out.print("Digite um número: ");
	                num = scanner.nextInt();

	                r = num % 2;

	                if (r == 0) {
	                    if (col_p > 3) {
	                        lin_p++;
	                        col_p = 0;
	                    }
	                    if (lin_p > 4) {
	                        System.out.println("Sem espaço para números pares");
	                    } 
	                    else {
	                        mat[lin_p][col_p] = num;
	                        col_p++;
	                    }
	                } 
	                else {
	                    if (col_i > 3) {
	                        lin_i++;
	                        col_i = 0;
	                    }
	                    if (lin_i > 4) {
	                        System.out.println("Sem espaço para números ímpares");
	                    } 
	                    else {
	                        mat[lin_i][col_i] = num;
	                        col_i++;
	                    }
	                }
	                tot++;
	            }
	        } while (tot != 20);

	        System.out.println("Matriz totalmente preenchida:");

	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 4; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }

    }
}