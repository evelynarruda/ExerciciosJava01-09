package Exercicios;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		elevado = Math.pow(num, 2);

		if(num % 2 == 0) {
			System.out.println("O número é par e sua potência é: " + elevado);
			raiz = Math.sqrt(num);

			
			System.out.println("E a raiz quadrada é: " + raiz);
			System.out.println("Raiz QUadrada: " + Math.sqrt(num));
			}
		else if (num % 2 == 1) {
			System.out.println("O número é impar e sua potência é " + elevado);
			
			}
         
		leia.close();
	}

}

