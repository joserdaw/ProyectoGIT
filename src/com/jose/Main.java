package com.jose;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		
		boolean dsa=true;
		int cont=0;
		do{
			cont++;
			System.out.println("D�nde est� la MSN?");
			if(cont>5)dsa=false;
		}while(dsa);
		System.out.println("La MSN d�nde est�");
	}

}
