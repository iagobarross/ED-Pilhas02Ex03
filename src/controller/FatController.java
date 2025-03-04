/*3. Baseado na lógica do Exercício 2, criar uma aplicação Java, baseada na biblioteca de pilha de int, que faça:
1) Criar uma classe view (Principal.java) que, na main:
a. Peça ao usuário um valor inteiro de 0 a 10 (Caso o usuário digite um valor fora desses limites, pedir
novamente, até que o valor atenda à solicitação);
2) Criar uma classe controller chamada FatController, que tenha um método fatorial(int valor): int e faça:
a. Inicialize uma pilha
b. Usando a pilha como suporte, calcule o fatorial do valor de entrada
c. O método deve retornar esse valor
3) O método main da classe Principal.java deve chamar o método fatorial(int valor): int e exibir em console o
valor do fatorial.
O método fatorial(int valor): int deve estar baseado nas operações da pilha de inteiros (push(), pop(), size(), top(),
isEmpty())
*/
package controller;

import br.edu.fateczl.pilhaInt.*;
import java.util.Scanner;

public class FatController {
	
	public FatController() {
		super();
	}
	
	public int fatorial(int valor) {
		Pilha p = new Pilha();
		
		int fatorial = 1;
		while(valor > 0) {
		p.push(valor);
		valor--;
		}
		
		while(!p.isEmpty()) {
			try {
				fatorial *= p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return fatorial;
		
	}
}
