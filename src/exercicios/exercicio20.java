package exercicios;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
        int cont = 0;
 
        for (int i = 1; i <= 20; i++) {
 
        	System.out.println("Informe um n�mero:");
        	Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
 
            if (num >= 8) {
                cont = cont + 1;
            }
        }
 
        System.out.println("A quantidade de n�mero maiores que 8 anos � " + cont);
	}

}
