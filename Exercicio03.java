package Exercicios;
import java.util.Scanner;


public class Exercicio03 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
				 
			 if(idade >=10 && idade <=14) {
				 System.out.println("Você está na categoria infantil e sua idade é " + idade + " anos");
			 }
			 if(idade >=15 && idade<=17) {
				 System.out.println("Você está na categoria juvenil e sua idade é " + idade + " anos");
				 }
			  else if(idade>=18 && idade <=25) {
				 System.out.println("Você está na categoria adulto e sua idade é " + idade + " anos");
			 }
			 
			 
			leia.close();
			 
			
			
		}

		
	}

