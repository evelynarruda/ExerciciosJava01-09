package Exercicios;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
		System.out.println("\nO maior número é o primeiro e o número digitado foi: " + n1);
		}
		
		if (n2 > n1 && n2 < n3);{
		System.out.println("\nO maior número é o segundo e o número digitado foi: " + n2);
		}
		
		if (n3 > n1 && n3 > n2) {
			System.out.println("\nO maior número é o terceiro e o número digitado foi: " + n3);
			
			
			leia.close();
			
		}
		
	}
	
	

}


