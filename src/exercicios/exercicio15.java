package exercicios;
import java.util.*;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
        int idade = 0;
 
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe uma idade:");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
 
            idade = idade + numero;
        }
 
        System.out.println("A soma total dos números lidos é: " + idade);
        
	}

}
