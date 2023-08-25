package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Média ponderada");
		System.out.println("===============");
		
		System.out.print("Digite a primeira nota: \n>");
		n1 = input.nextInt();
		System.out.print("Digite o peso: \n>");
		p1 = input.nextInt();
		

		System.out.print("Digite a segunda nota: \n>");
		n2 = input.nextInt();
		System.out.print("Digite o peso: \n>");
		p2 = input.nextInt();
		

		System.out.print("Digite a terceira nota: \n>");
		n3 = input.nextInt();
		System.out.print("Digite o peso: \n>");
		p3 = input.nextInt();
		
		media = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
		System.out.println("A média ponderada dos números resultou em: "+ media);
	}

}