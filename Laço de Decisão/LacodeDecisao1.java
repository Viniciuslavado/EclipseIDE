package PacoteJava2;

import java.util.*;
public class LacodeDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,maiorvalor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		maiorvalor = n1;
				if(maiorvalor<n2) {
				maiorvalor = n2;
				
				if(maiorvalor<n3) {
					maiorvalor = n3;
				}
				
				System.out.println("\nO Maior valor é:");	

			}
	}
}