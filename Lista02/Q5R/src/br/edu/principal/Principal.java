package br.edu.principal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		double numUm, numDois, numTres, numQuat;
		
		System.out.println("Digite tr�s n�meros em ordem crescente");
		System.out.print("Digite o primeiro n�mero: ");
		numUm = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		numDois = sc.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		numTres = sc.nextDouble();
		
		while(numDois < numUm || numTres < numDois) {
			System.out.println(" ");
			System.out.println("Os tr�s n�meros n�o est�o em ordem crescente.\nDigite novamente.");
			System.out.print("Digite o primeiro n�mero: ");
			numUm = sc.nextDouble();
			System.out.print("Digite o segundo n�mero: ");
			numDois = sc.nextDouble();
			System.out.print("Digite o terceiro n�mero: ");
			numTres = sc.nextDouble();
		}
		
		System.out.print("Digite o quarto n�mero: ");
		numQuat = sc.nextDouble();
		
		if(numQuat >numTres) {
			System.out.println("A ordem decrescente �: " + numQuat + " - " + numTres + " - " + numDois + " - " + numUm);
		}
		else if(numQuat > numDois && numQuat < numTres) {
			System.out.println("A ordem decrescente �: " + numTres + " - " + numQuat + " - " + numDois + " - " + numUm);
		}
		else if(numQuat > numUm && numQuat < numDois) {
			System.out.println("A ordem decrescente �: " + numTres + " - " + numDois + " - " + numQuat + " - " + numUm);
		}
		else {
			System.out.println("A ordem decrescente �: " + numTres + " - " + numDois + " - " + numUm + " - " + numQuat);
		}
	}

}
