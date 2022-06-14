package exercicios;
import java.util.*;
public class exercicio3 {
	
	// 3- A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o 
	// saldo médio no último ano. Fazer um programa em JAVA que leia o saldo médio de um cliente 
	// e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem 
	// informando o saldo médio e o valor de crédito.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner saldo = new Scanner(System.in);
		System.out.println("Digite seu saldo médio:");
		double val_saldo = saldo.nextDouble();
		
		if(val_saldo <= 500) {
			System.out.println("Seu saldo médio é de R%" + val_saldo + " e você não possui nenhum crédito especial");
		}else if(val_saldo <= 1000) {
			double credito = 0.3 * val_saldo;
			System.out.println("Seu saldo médio é de R$" + val_saldo + " e o seu valor do seu crédito especial é de R$" + credito);
		}else if(val_saldo <= 3000) {
			double credito = 0.4 * val_saldo;
			System.out.println("Seu saldo médio é de R$" + val_saldo + " e o seu valor do seu crédito especial é de R$" + credito);
		}else if(val_saldo >= 3001) {
			double credito = 0.5 * val_saldo;
			System.out.println("Seu saldo médio é de R$" + val_saldo + " e o seu valor do seu crédito especial é de R$" + credito);
		}else {
			System.out.println("Valor inválido!");
		}
	}

}
