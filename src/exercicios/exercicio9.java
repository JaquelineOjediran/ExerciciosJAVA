package exercicios;
import java.util.*;
public class exercicio9 {
	
	// 9- Crie um pgm que leia o valor do salário mínimo e o valor do 
	// salário de um usuário, calcule a quantidade de salários mínimos
	// esse usuário ganha e imprima o resultado. (Salário mínimo = R$1.212,00).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite seu salário: ");
		Scanner val_salario = new Scanner(System.in);
		float salario = val_salario.nextFloat();
		
		float qtd_salarios_min = salario / 1212;
		
		System.out.println("O valor "  + salario + " equivale a " + qtd_salarios_min + " salários mínimos.");
		
	}

}
