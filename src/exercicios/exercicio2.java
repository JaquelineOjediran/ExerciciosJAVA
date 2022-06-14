package exercicios;
import java.util.*;
public class exercicio2 {
	
	// 2- Escreva um programa em Java, que leia um número e informe se ele é divisível 
	// por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner numero = new Scanner(System.in); 
		    System.out.println("Digite um número: ");
		    
		    int num = numero.nextInt();
		    
		    if(num % 10 == 0 || num % 5 == 0 || num % 2 == 0) {
		    	System.out.println("\nNúmero divisivel por 10, 5 ou 2\n");
		    }else {
		    	System.out.println("\nNúmero não divisivel por 10, 5 ou 2\n");
		    }
	}

}
