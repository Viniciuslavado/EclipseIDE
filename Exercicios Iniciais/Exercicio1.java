package PacoteJava;

import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,meses,dias,totalDedias;
		Scanner leia = new Scanner(System.in);
			
			System.out.println("Entre com a sua idade:");
			idade = leia.nextInt();
			System.out.println("\nEntre com a quantidade de meses:");
			meses = leia.nextInt();
			System.out.println("\nEntre com a quantidade de dias:");
			dias = leia.nextInt();
			
			totalDedias = idade*365+meses*12+dias;
			System.out.println("\nVocê viveu o total de "+totalDedias+"dias.");

	}

}
