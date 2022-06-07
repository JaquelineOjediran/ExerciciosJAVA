package Exercicios;
import java.util.*;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner saldo = new Scanner(System.in);
		System.out.println("Digite seu saldo médio:");
		int val_saldo = saldo.nextInt();
		
		if(val_saldo <= 500) {
			System.out.println("Seu saldo médio é de " + val_saldo + " e você não possui nenhum crédito");
		}else if(val_saldo <= 1000) {
			int credito = (30/100) * val_saldo;
			System.out.println("Seu saldo médio é de " + val_saldo + " e o seu valor de crédito é de " + credito);
		}else if(val_saldo <= 3000) {
			int credito = (40/100) * val_saldo;
			System.out.println("Seu saldo médio é de " + val_saldo + " e o seu valor de crédito é de " + credito);
		}else if(val_saldo >= 3001) {
			int credito = (50/100) * val_saldo;
			System.out.println("Seu saldo médio é de " + val_saldo + " e o seu valor de crédito é de " + credito);
		}else {
			System.out.println("Valor inválido!");
		}
	}

}
