package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numUm, numDois, numTres;
		
		System.out.print("Digite o primeiro n�mero: ");
		numUm = sc.nextDouble();
		System.out.print("Digite o segundo n�mero:");
		numDois = sc.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		numTres = sc.nextDouble();
		
		if(numUm < numDois && numUm < numTres) {
			if (numDois < numTres) {
				System.out.println("A ordem crescente dos n�meros �: " + numUm + " - " + numDois + " - " + numTres);
			}
			else {
				System.out.println("A ordem crescente dos n�meros �: " + numUm + " - " + numTres + " - " + numDois);
			}
		}
		
		if(numDois < numUm && numDois < numTres) {
			if(numUm < numTres) {
				System.out.println("A ordem crescente dos n�meros �: " + numDois + " - " + numUm + " - " + numTres);
			}
			else {
				System.out.println("A ordem crescente dos n�meros �: " + numDois + " - " + numTres + " - " + numUm);
			}
		}
		
		if(numTres < numDois && numTres < numUm) {
			if(numUm < numDois) {
				System.out.println("A ordem crescente dos n�meros �: " + numTres + " - " + numDois + " - " + numUm);
			}
			else {
				System.out.println("A ordem crescente dos n�meros �: " + numTres + " - " + numUm + " - " + numDois);
			}
		}
	}

}
