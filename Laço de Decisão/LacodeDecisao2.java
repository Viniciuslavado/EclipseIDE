package PacoteJava2;

import java.util.Scanner;

public class LacodeDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1,numero2,numero3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Primeiro numero");
		numero1 = leia.nextFloat();
		System.out.println("\nDigite o Segundo numero");
		numero2 = leia.nextFloat();
		System.out.println("\nDigite o Terceiro numero");
		numero3 = leia.nextFloat();
		
		if(numero1 >numero2&&numero1 >numero3) {
		System.out.println("\nMaior número é:"+numero1);
		
		} else if(numero2 >numero1&&numero2 >numero3) {
		System.out.println("\nMaior número é:"+numero2);
		
		} else if(numero3 >numero1&&numero3 >numero2) {
		System.out.println("\nMaior número é:"+numero3);
		
		} else {
			System.out.println("\nOs números são iguais"+numero1);
		}
			}
}