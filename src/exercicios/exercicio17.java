package exercicios;
import java.util.*;
public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int idade;
        int cont = 0;
 
        for (int i = 1; i <= 20; i++) {
 
        	System.out.println("Informe uma idade:");
        	Scanner sc = new Scanner(System.in);
            idade = sc.nextInt();
 
            if (idade >= 18) {
                cont = cont + 1;
            }
        }
 
        System.out.println("A quantidade de pessoas maiores de 18 anos é " + cont);
    }
 
}


