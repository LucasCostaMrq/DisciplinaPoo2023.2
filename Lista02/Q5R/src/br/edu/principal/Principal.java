package br.edu.principal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		double numUm, numDois, numTres, numQuat;
		
		System.out.println("Digite três números em ordem crescente");
		System.out.print("Digite o primeiro número: ");
		numUm = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		numDois = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		numTres = sc.nextDouble();
		
		while(numDois < numUm || numTres < numDois) {
			System.out.println(" ");
			System.out.println("Os três números não estão em ordem crescente.\nDigite novamente.");
			System.out.print("Digite o primeiro número: ");
			numUm = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			numDois = sc.nextDouble();
			System.out.print("Digite o terceiro número: ");
			numTres = sc.nextDouble();
		}
		
		System.out.print("Digite o quarto número: ");
		numQuat = sc.nextDouble();
		
		if(numQuat >numTres) {
			System.out.println("A ordem decrescente é: " + numQuat + " - " + numTres + " - " + numDois + " - " + numUm);
		}
		else if(numQuat > numDois && numQuat < numTres) {
			System.out.println("A ordem decrescente é: " + numTres + " - " + numQuat + " - " + numDois + " - " + numUm);
		}
		else if(numQuat > numUm && numQuat < numDois) {
			System.out.println("A ordem decrescente é: " + numTres + " - " + numDois + " - " + numQuat + " - " + numUm);
		}
		else {
			System.out.println("A ordem decrescente é: " + numTres + " - " + numDois + " - " + numUm + " - " + numQuat);
		}
	}

}
