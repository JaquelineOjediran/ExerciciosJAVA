package exercicios;
import java.util.*;
public class exercicio6 {
	
	// 6- Desenvolva um pgm em Java que leia um número inteiro e
	// imprima o seu antecessor e seu sucessor.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner ler_num = new Scanner(System.in);
	System.out.println("Digite um número: ");
	
	int numero = ler_num.nextInt();
	int antecessor = numero - 1;
	int sucessor = numero + 1;
	
	System.out.println("O antecessor de " + numero + " é " + antecessor + "\nO sucessor de " + numero + " é " + sucessor);
	
	}
}
