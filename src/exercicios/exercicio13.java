package exercicios;
import java.util.*;
public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Digite a temperatura em Graus Celsius (°C): " );  
		Scanner sc = new Scanner(System.in);
		   
		float celsius = sc.nextFloat();          
		float fahrenheit = (celsius * 9/5) + 32;          
		System.out.printf(" A temperatura convertida para Fahrenheit é: " + fahrenheit);
		
	}

}
