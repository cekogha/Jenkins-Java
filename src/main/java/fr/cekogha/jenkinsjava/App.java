package fr.cekogha.jenkinsjava;

import fr.cekogha.jenkinsjava.functions.MathOperations;

public class App 
{
	public static void main( String[] args )
	{
		    	MathOperations mO = new MathOperations();
		    	System.out.println("3 + 4 = " + mO.addition(3, 4));
		    	System.out.println("6 - 3 = " + mO.substraction(6, 3));
		    	System.out.println("6 - 7 = " + mO.substraction(6, 7));
	}
}
