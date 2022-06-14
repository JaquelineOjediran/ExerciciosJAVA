package exercicios;
import java.util.*;
public class exercicio1 {

	// 1-Criar um programa em Java, que informe a quantidade total de calorias de uma refeição a 
	// partir do usuário que deverá informar o prato, a sobremesa e a bebida.
	// Sugestão: enumere cada opção de prato, sobremesa e bebida. Ou seja: Prato: 1 - vegetariano,
	// 2 – Peixe, 3 – Frango, 4 – Carne; Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet,
	// 4 – Mouse chocolate; Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet.
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner pratos = new Scanner(System.in);
			System.out.print("Selecione um prato: \n 1 - Vegetariano  \n 2 - Peixe \n 3 - Frango  \n 4 - Carne \n\n");
			
			int prato = pratos.nextInt();
			switch (prato) {
			  case 1:
				    System.out.println("180 cal\n");
				    break;
			  case 2:
				    System.out.println("230 cal\n");
				    break;
			  case 3:
				    System.out.println("250 cal\n");
				    break;
			  case 4:
				    System.out.println("350 cal\n");
				    break;
			  default:
			    System.out.println("Valor inexistente!\n");
			}
			
			Scanner sobremesas = new Scanner(System.in);
			System.out.print("Selecione uma sobremesa: \n 1 - Abacaxi \n 2 - Sorvete diet \n 3 - Mouse diet\n 4 - Mouse chocolate\n\n");
			
			int sobremesa = sobremesas.nextInt();
			switch (sobremesa) {
			  case 1:
				    System.out.println("75 cal\n");
				    break;
			  case 2:
				    System.out.println("110 cal\n");
				    break;
			  case 3:
				    System.out.println("170 cal\n");
				    break;
			  case 4:
				    System.out.println("200 cal\n");
				    break;
			  default:
			    System.out.println("Valor inexistente!\n");
			}
			
			Scanner bebidas = new Scanner(System.in);
			System.out.print("Selecione uma bebida: \n 1 - Chá \n 2 - Suco de laranja \n 3 - Suco de melão\n 4 - Refrigerante diet\n\n");
			
			int bebida = bebidas.nextInt();
			switch (bebida) {
			  case 1:
				    System.out.println("20 cal\n");
				    break;
			  case 2:
				    System.out.println("70 cal\n");
				    break;
			  case 3:
				    System.out.println("100 cal\n");
				    break;
			  case 4:
				    System.out.println("65 cal\n");
				    break;
			  default:
			    System.out.println("Valor inexistente!\n");
			}
			
			if(prato == 1) {
				prato = 180;
			}else if(prato == 2){
				prato = 230;
			}else if(prato == 3){
				prato = 250;
			}else if(prato == 4){
				prato = 350;
			}else {
				System.out.println("Valor inválido");
				prato = 0;
			}
			
			
			if(sobremesa == 1){
				sobremesa = 75;
			}else if(sobremesa == 2) {
				sobremesa = 110;
			}else if(sobremesa == 3) {
				sobremesa = 170;
			}else if(sobremesa == 4) {
				sobremesa = 200;	
			}else {
				System.out.println("Valor inválido");
				sobremesa = 0;
			}
			
			
			if(bebida == 1) {
				bebida = 20;
			}else if(bebida == 2) {
				bebida = 70;
			}else if(bebida == 3) {
				bebida = 100;
			}else if(bebida == 4) {
				bebida = 65;
			}else {
				System.out.println("Valor inválido");
				bebida = 0;
			}
			
			int tot_calorias = prato + sobremesa + bebida;
			
			System.out.println("O total de calorias é: " + tot_calorias + " cal");
		}

	
	}


