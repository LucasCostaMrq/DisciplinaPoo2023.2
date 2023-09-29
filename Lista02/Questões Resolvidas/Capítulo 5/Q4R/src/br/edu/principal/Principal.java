package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, rsal, inc, tax;
		
		System.out.println("KNOW YOUR SALARY");

		System.out.print("Digite o seu salário: ");
		sal = sc.nextInt();
		
		inc = sal * 5/100;
		tax = sal * 7/100;
		rsal = sal + inc - tax;
		
		System.out.println("O salário final resulta em: " + rsal + " reais");

	}

}
