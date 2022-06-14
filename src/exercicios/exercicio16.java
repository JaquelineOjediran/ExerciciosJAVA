package exercicios;
import java.util.*;

public class exercicio16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int med, idade;
		med = 0;
 
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe uma idade:");
            Scanner sc = new Scanner(System.in);
            idade = sc.nextInt();
 
            med = idade + med;
        }
        
        med = med / 20;
        System.out.println("Média de idade é: " + med);
	}

}
