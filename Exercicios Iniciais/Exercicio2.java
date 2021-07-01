package PacoteJava;

import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int segundos,minutos,horas,temposegundos;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nQuanto tempo levou em segundos:");
		
		temposegundos = leia.nextInt();
		horas = temposegundos/3600;
		minutos=(temposegundos%3600)/60;
		segundos=(temposegundos%3600)%60;
		
		System.out.println("\nHoras: "+horas+", Minutos:"+minutos+", Segundos: "+segundos);
	}
}