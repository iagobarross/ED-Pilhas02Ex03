package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		FatController fatCont = new FatController();
		
		int numero = 0;
		
		while(numero < 1 || numero > 10) {
		System.out.println("Digite um numero de 1 a 10: ");
		numero = sc.nextInt();
		}
		
		int fatorial = fatCont.fatorial(numero);
		
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}
}