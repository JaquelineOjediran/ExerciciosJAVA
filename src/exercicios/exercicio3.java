package exercicios;
import java.util.*;
public class exercicio3 {
	
	// 3- A CEF conceder� um cr�dito especial com juros de 2% aos seus clientes de acordo com o 
	// saldo m�dio no �ltimo ano. Fazer um programa em JAVA que leia o saldo m�dio de um cliente 
	// e calcule o valor do cr�dito de acordo com a tabela a seguir. Imprimir uma mensagem 
	// informando o saldo m�dio e o valor de cr�dito.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner saldo = new Scanner(System.in);
		System.out.println("Digite seu saldo m�dio:");
		double val_saldo = saldo.nextDouble();
		
		if(val_saldo <= 500) {
			System.out.println("Seu saldo m�dio � de R%" + val_saldo + " e voc� n�o possui nenhum cr�dito especial");
		}else if(val_saldo <= 1000) {
			double credito = 0.3 * val_saldo;
			System.out.println("Seu saldo m�dio � de R$" + val_saldo + " e o seu valor do seu cr�dito especial � de R$" + credito);
		}else if(val_saldo <= 3000) {
			double credito = 0.4 * val_saldo;
			System.out.println("Seu saldo m�dio � de R$" + val_saldo + " e o seu valor do seu cr�dito especial � de R$" + credito);
		}else if(val_saldo >= 3001) {
			double credito = 0.5 * val_saldo;
			System.out.println("Seu saldo m�dio � de R$" + val_saldo + " e o seu valor do seu cr�dito especial � de R$" + credito);
		}else {
			System.out.println("Valor inv�lido!");
		}
	}

}
