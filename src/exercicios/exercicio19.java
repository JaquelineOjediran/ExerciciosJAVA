package exercicios;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dolar, cotacao, real;
		
		System.out.println("Digite a quantidade em D�lar: ");
		Scanner sc = new Scanner(System.in);
		dolar = sc.nextDouble();
		
		System.out.println("Digite o valor da cota��o hoje: ");
		cotacao = sc.nextDouble();
		
		real = dolar * cotacao;
		System.out.println("Valor em reais (R$) �: " + real);
	}

}
