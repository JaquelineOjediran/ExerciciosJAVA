package exercicios;
import java.util.*;
public class exercicio7 {
	
	// 7- Fazer um programa que imprima a média aritmética dos números
	// 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias.
	// A média das médias.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float media1 = (8 + 9 + 7)/3;
		float media2 = (4 + 5 + 6)/3;
		float total_media = (media1 + media2)/2;
		float soma_media = media1 + media2;
		
		
		System.out.println("A média aritmética dos números 8, 9 e 7 é " + media1);
		System.out.println("A média aritmética dos números 4, 5 e 6 é " + media2);
		System.out.println("A soma das médias é " + soma_media);
		System.out.println("A média aritmética das médias é " + total_media);
	}

}
