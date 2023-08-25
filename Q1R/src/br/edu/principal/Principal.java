package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, n4, soma;
		
		System.out.println("Soma de números");
		System.out.println("===============");
		
		System.out.print("Digite o primeiro número: ");
		n1 = input.nextInt();

		System.out.print("Digite o segundo número: ");
		n2 = input.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		n3 = input.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		n4 = input.nextInt();
		System.out.println(" ");
		
		soma = n1 + n2 + n3 + n4;
		System.out.println("A soma dos números resulta em: " +soma);
	}

}