package Exercicios;
import java.util.*;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner valores = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int num1 = valores.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int num2 = valores.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		int num3 = valores.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			}else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		}else if(num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			}else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		}else {
			if(num1 > num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			}else {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
	}

}
