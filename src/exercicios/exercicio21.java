package exercicios;
import java.util.*;
public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vp1, vp2, vp3, vp4, vp5, valor;
		
		System.out.println("Digite o valor da compra: ");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		
		vp1 = valor / 1;
		vp2 = valor / 2;
		vp3 = valor / 3;
		vp4 = valor / 4;
		vp5 = valor / 5;
		
		System.out.println("Valor em 1 (uma) prestação: " + vp1);
		System.out.println("Valor em 2 (duas) prestações: " + vp2);
		System.out.println("Valor em 3 (três) prestações: " + vp3);
		System.out.println("Valor em 4 (quatro) prestações: " + vp4);
		System.out.println("Valor em 5 (cinco) prestações: " + vp5);
	}

}
