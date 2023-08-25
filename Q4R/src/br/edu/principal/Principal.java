package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double aumento, salario, novoSalario;
		System.out.println("Cálculo de salário mais aumento");
		System.out.println("===============================");
		
		System.out.print("Digite o salário do funcionario: ");
		salario = input.nextDouble();
		aumento = salario*(0.25);

		novoSalario = salario + aumento;
		System.out.println("O salário do funcionario mais o aumento resultou em: " + novoSalario);
	}
}