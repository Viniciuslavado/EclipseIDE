package PacoteJava;

import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int dia,mes,ano,soma;
	      Scanner leia = new Scanner(System.in);
	      
	      System.out.println("\nEntre com o dia do seu Anivers�rio");
	      dia = leia.nextInt();
	      System.out.println("\nEntre com o mes do seu Anivers�rio");
	      mes = leia.nextInt();
	      System.out.println("\nEntre com o ano do seu Anivers�rio");
	      ano = leia.nextInt();
	      
	      soma = dia + 30 * mes + 365 * ano;
	      System.out.println("\nSua idade em dias � de:"+soma);
	      
	}

}
