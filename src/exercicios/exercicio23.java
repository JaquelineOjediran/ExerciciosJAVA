package exercicios;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
 
        for (int i = 1; i <= 20; i++) {
 
        	System.out.println("Informe um n�mero:");
        	Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
 
            if (num > 0 && num <= 100) {
                cont1 = cont1 + 1;
            }else if(num > 100 && num <= 200) {
            	cont2 = cont2 + 1;
            }else if(num > 200) {
            	cont3 = cont3 + 1;
            }
            
            
        }
 
        System.out.println("A quantidade de n�meros entre 0 e 100 � " + cont1);
        System.out.println("A quantidade de n�meros entre 101 e 200 � " + cont2);
        System.out.println("A quantidade de n�meros maiores de 300 � " + cont3);
		
	}

}
