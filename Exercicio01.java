package Exercicios;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
		System.out.println("\nO maior n�mero � o primeiro e o n�mero digitado foi: " + n1);
		}
		
		if (n2 > n1 && n2 < n3);{
		System.out.println("\nO maior n�mero � o segundo e o n�mero digitado foi: " + n2);
		}
		
		if (n3 > n1 && n3 > n2) {
			System.out.println("\nO maior n�mero � o terceiro e o n�mero digitado foi: " + n3);
			
			
			leia.close();
			
		}
		
	}
	
	

}


