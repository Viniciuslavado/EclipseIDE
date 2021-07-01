package PacoteJava2;

import java.util.*;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner(System.in);
        
        int x = 2, y = 2, constante;
        
        int [][] array1 = new int[x][y];
        int [][] array2 = new int[x][y];
        int [][] array3 = new int[x][y];
        
        System.out.println("\n\tDigite 4 valores para cada matriz");
        
        for(int l = 0; l < x; l++) {
            
            for(int c = 0; c < y; c++) {
                                
                System.out.println("\nDigite os valores da primeira matriz " );
                array1[l][c] = leia.nextInt();            
                
            }
        }
        
        for(int l = 0; l < x; l++) {
            
            for(int c = 0; c < y; c++) {
                                
                System.out.println("\nDigite os números da segunda matriz " );
                array2[l][c] = leia.nextInt();            
                
            }
        }
        
        System.out.println("\nDigite o valor inteiro para a constante ");
        constante = leia.nextInt();
        
        for(int l = 0; l < x; l++) {
            
            for(int c = 0; c < y; c++) {

                array3[l][c] = array1[l][c] + array2[l][c] + constante;
                System.out.println("Valor da terceira matriz " + array3[l][c]);
            }
        }
    }
}