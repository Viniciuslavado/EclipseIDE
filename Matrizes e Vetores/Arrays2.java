package PacoteJava2;

import java.util.*;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner read = new Scanner(System.in);
	        
	        int x = 6, contPar = 0, contimpar = 0, totalpar = 0, totalimpar = 0;
	        
	        int [] num = new int [x];
	        
	        for(int v = 0; v < num.length; v++) {
	            
	            System.out.println("\n"
	                    + "Entre com um número ");
	            num[v] = leia.nextInt();
	            
	            boolean ok = num[v] % 2 == 0;
	            
	            if (ok) {
	                
	                contPar++;
	                totalpar += num[v];
	                
	            } else {
	                
	                contimpar++;
	                totalimpar += num[v];
	                
	            }
	        }
	        
	        System.out.println("\n\tO total de números pares digitados "
	                + contpar
	                + " e a sua soma deu "
	                + totalpar);
	        System.out.println("\n\tO total de números impares digitados "
	                + contimpar
	                + " Soma total "
	                + totalimpar);
		
		
		
		
	}

}
