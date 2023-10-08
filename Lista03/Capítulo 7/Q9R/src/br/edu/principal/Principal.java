package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[][] mat = new int[15][5];
        int[][] rep = new int[15][5];
        int[][] vezes = new int[15][5];
        int lin, lin2, col, x, num, qtde, achou;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = input.nextInt();
            }
        }

        lin = 0;
        col = 0;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                qtde = 1;
                num = mat[i][j];

                for (int k = 0; k < 15; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (i != k || j != l) {
                            if (mat[k][l] == num) {
                                qtde++;
                            }
                        }
                    }
                }

                if (qtde > 1) {
                    achou = 0;
                    if (col == 0) {
                        lin2 = lin - 1;
                    } else {
                        lin2 = lin;
                    }

                    for (int k = 0; k <= lin2; k++) {
                        if (k < lin2) {
                            x = 5;
                        } else {
                            x = col;
                        }

                        for (int l = 0; l < x; l++) {
                            if (num == rep[k][l]) {
                                achou = 1;
                            }
                        }
                    }

                    if (achou == 0) {
                        rep[lin][col] = num;
                        vezes[lin][col] = qtde;
                        col++;

                        if (col > 4) {
                            lin++;
                            col = 0;
                        }
                    }
                }
            }
        }

        for (int i = 0; i <= lin; i++) {
            if (i < lin) {
                x = 5;
            } else {
                x = col;
            }

            for (int j = 0; j < x; j++) {
                System.out.println("O número " + rep[i][j] + " repetiu " + vezes[i][j] + " vezes.");
            }
        }

	}
}
