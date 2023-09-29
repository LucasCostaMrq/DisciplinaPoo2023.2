package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		String A [] = new String[20];
		String B [] = new String[20];
		String aux;
		
		for (int i = 0; i < A.length; i++) {
			A[i] = i + "a";
			aux = A[i];
			System.out.println("Posição " + i + " do vetor A contém: " + A[i]);
			
		}
		System.out.println(" ");
		for (int y = 0; y < B.length ; y++) {
			B[y] = y + "b";
			System.out.println("Posição " + y + " do vetor B contém: " + B[y]);
		}
		
		System.out.println("\nTROCA DOS VETORES:\n");
		int j = 19;
		for(int i = 0; i < 20; i++ ) {
			aux = A[i];
			A[i] = B[j];
			B[j] = aux;
			j--;
		}
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Posição " + i + " do vetor A contém: " + A[i]);
			
		}
		System.out.println(" ");
		System.out.println(" ");
		for (int y = 0; y < B.length ; y++) {
			System.out.println("Posição " + y + " do vetor B contém: " + B[y]);
		}
		
		}
		
}
