package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[][] prod = new int[5][3];
	        int tot_arm, maior_e = 0;
	        int menor_e = 0, custo_p, custo_a, ind_a = 0;

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Informe a quantidade de itens no armazém " + (i + 1) + " no produto " + (j + 1) + ": ");
	                prod[i][j] = scanner.nextInt();
	            }
	        }

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Informe a quantidade do produto " + (i + 1) + " no armazém 5: ");
	            prod[4][i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 4; i++) {
	            tot_arm = 0;
	            for (int j = 0; j < 3; j++) {
	                tot_arm += prod[i][j];
	            }
	            System.out.println("O total de itens no armazém " + (i + 1) + " = " + tot_arm);

	            if (i == 0) {
	                menor_e = tot_arm;
	                ind_a = i + 1;
	            } else {
	                if (tot_arm < menor_e) {
	                    menor_e = tot_arm;
	                    ind_a = i + 1;
	                }
	            }
	        }

	        System.out.println("Armazém com menor estoque: " + ind_a);

	        for (int i = 0; i < 4; i++) {
	            if (i == 0) {
	                maior_e = prod[i][1];
	                ind_a = i + 1;
	            } else {
	                if (prod[i][1] > maior_e) {
	                    maior_e = prod[i][1];
	                    ind_a = i + 1;
	                }
	            }
	        }

	        System.out.println("O maior estoque do produto 2 está no armazém " + ind_a);

	        for (int j = 0; j < 3; j++) {
	            custo_p = 0;
	            for (int i = 0; i < 4; i++) {
	                custo_p += prod[i][j];
	            }
	            custo_p *= prod[4][j];
	            System.out.println("O custo total do produto " + (j + 1) + " = " + custo_p);
	        }

	        for (int i = 0; i < 4; i++) {
	            custo_a = 0;
	            for (int j = 0; j < 3; j++) {
	                custo_a += prod[i][j] * prod[4][j];
	            }
	            System.out.println("O custo total do armazém " + (i + 1) + " = " + custo_a);
	        }
    }
}
