package exercicios;
import java.util.*;
public class exercicio7 {
	
	// 7- Fazer um programa que imprima a m�dia aritm�tica dos n�meros
	// 8,9 e 7. A m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias.
	// A m�dia das m�dias.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float media1 = (8 + 9 + 7)/3;
		float media2 = (4 + 5 + 6)/3;
		float total_media = (media1 + media2)/2;
		float soma_media = media1 + media2;
		
		
		System.out.println("A m�dia aritm�tica dos n�meros 8, 9 e 7 � " + media1);
		System.out.println("A m�dia aritm�tica dos n�meros 4, 5 e 6 � " + media2);
		System.out.println("A soma das m�dias � " + soma_media);
		System.out.println("A m�dia aritm�tica das m�dias � " + total_media);
	}

}
