package Exercicios;
import java.util.Scanner;


public class Exercicio03 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
				 
			 if(idade >=10 && idade <=14) {
				 System.out.println("Voc� est� na categoria infantil e sua idade � " + idade + " anos");
			 }
			 if(idade >=15 && idade<=17) {
				 System.out.println("Voc� est� na categoria juvenil e sua idade � " + idade + " anos");
				 }
			  else if(idade>=18 && idade <=25) {
				 System.out.println("Voc� est� na categoria adulto e sua idade � " + idade + " anos");
			 }
			 
			 
			leia.close();
			 
			
			
		}

		
	}

