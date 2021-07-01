package PacoteJava2;
import java.util.*;
public class ExerciciodeRepetição3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler =  new  Scanner(System.in);
		
		int idade, contidade =  0 , contidade1 = 0 ;
		System.out.println("\nEntre com uma idade: ");
		idade = ler . nextInt ();
		
		while (idade!=  - 99 )
		{
			System.out.println("\nEntre com uma idade: ");
			idade = ler . nextInt ();
			if(idade <  21 )
			{
				contidade ++ ;
			}
			else  if (idade >  50 )
			{
				contidade1 ++ ;
			}						

		}
		System.out.println("\n Numero de pessoas com menos de 50 anos é de:"  + contidade);
		System.out.println("\n Numero de pessoas com mais de 50 anos é de:"  + contidade1);
	
	
	
	}

}
