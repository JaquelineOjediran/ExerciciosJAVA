package exercicios;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero = 0;
        int soma = 0;
 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe um n�mero:");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
            if (numero < 0) {
            	System.exit(i);

            }
            soma = soma + numero;
        }
 
        System.out.println("A soma total dos n�meros lidos �: " + soma);
        
	}

}
