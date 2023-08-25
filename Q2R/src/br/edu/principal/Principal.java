package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, media;
		System.out.println("Média Aritmética de três números");
		System.out.println("================================");
		
		System.out.print("Digite o primeiro número: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = input.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		media = (n1 + n2 + n3)/3;
		System.out.println("A média dos números resulta em: " + media);
	}

}
