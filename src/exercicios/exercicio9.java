package exercicios;
import java.util.*;
public class exercicio9 {
	
	// 9- Crie um pgm que leia o valor do sal�rio m�nimo e o valor do 
	// sal�rio de um usu�rio, calcule a quantidade de sal�rios m�nimos
	// esse usu�rio ganha e imprima o resultado. (Sal�rio m�nimo = R$1.212,00).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite seu sal�rio: ");
		Scanner val_salario = new Scanner(System.in);
		float salario = val_salario.nextFloat();
		
		float qtd_salarios_min = salario / 1212;
		
		System.out.println("O valor "  + salario + " equivale a " + qtd_salarios_min + " sal�rios m�nimos.");
		
	}

}
