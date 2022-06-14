package exercicios;
import java.text.DecimalFormat;
import java.util.*;
public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe um saldo: ");
		Scanner sc = new Scanner(System.in);
		double saldo = sc.nextDouble();
		
		double reajuste = (saldo * (1.5 / 100)) + saldo;
		DecimalFormat reajustef = new DecimalFormat("#.##");
		
		System.out.println("O saldo com reajuste é igual a " + reajustef.format(reajuste));
		
	}

}
