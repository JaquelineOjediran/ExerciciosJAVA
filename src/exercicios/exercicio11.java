package exercicios;
import java.text.DecimalFormat;
import java.util.*;
public class exercicio11 {

	// 11- Escrever um programa que leia o nome de um vendedor, o seu salário 
	// fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo
	// que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
	// informar o seu nome, o salário fixo e salário no final do mês. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o nome do vendedor: ");
		Scanner sc = new Scanner(System.in);
		String vendedor = sc.next();
		
		System.out.println("Digite o salário do vendedor: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite o total de vendas feitas pelo vendedor no mês: ");
		double vendas = sc.nextDouble();
		
		double comissao = 0.15 * vendas;
		double tot_salario = comissao + salario;
		
		DecimalFormat salariof = new DecimalFormat("#.##");
		DecimalFormat totsalariof = new DecimalFormat("#.##");
		
		System.out.println("Vendedor: " + vendedor);
		System.out.println("Salário fixo: " + salariof.format(salario));
		System.out.println("Salário junto da comissão: " + totsalariof.format(tot_salario));
	}

}
