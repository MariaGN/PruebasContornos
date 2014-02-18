package Ejemplo;

import java.util.Scanner;

public class GetInt {

	private static Scanner entradaXTeclado;

	public static int getInt(String rotulo, boolean positivo)
	    {
	    int     entero;                       // numero introducido por teclado
	 
	    entradaXTeclado = new Scanner(System.in);
	 
	    do{
	      System.out.print(rotulo);
	      entero = entradaXTeclado.nextInt(); // introducci�n x teclado y conversi�n
	      }
	    while(positivo && entero <= 0);       // se pide positivo y no lo es
	 
	    return entero;                        // devolver entero introducido
	    }
	 public static void autor() 
	    {
         System.out.println("Creado por Mar�a del Carmen Gomez Nimo". CD);
	    }
}
