package PacoteJava2;

import java.util.*;
public class ExerciciodeRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		float numero;
		int contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		for(int x=0; x< 10; x++);
		System.out.println("Entre com um valor:");
		
		numero = leia.nextFloat();
		
				if (numero % 2==0) {
						contpar ++ ;
				} else {
						contimpar ++;
				}
			}
			
			System.out.println("\nNumeros pares: "+contpar);
			System.out.println("\nNumeros impares: "+contimpar);
		}
}