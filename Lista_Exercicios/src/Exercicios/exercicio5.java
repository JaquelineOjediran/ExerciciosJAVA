package Exercicios;
import java.util.*;
public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler_idade = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade = ler_idade.nextInt();
		
		if(idade < 16) {
			System.out.println("Não eleitor");
		}else if(idade <= 17 || idade > 65) {
			System.out.println("Eleitor facultativo");
		}else if(idade >= 18 ){
			System.out.println("Eleitor obrigatório");
		}
	}

}
