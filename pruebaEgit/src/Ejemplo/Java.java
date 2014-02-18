package Ejemplo;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,
	    mayor=-2147483648,
	    contador,
	    menor=2147483647;
	    
	for(contador=0;contador<3;contador++)
	  {      
      numero = GetInt.getInt("Introduzca un entero: ", false);
      if(numero < menor) menor = numero;
      if(numero > mayor) mayor = numero; 
	  }  
	System.out.printf("\nMenor: %d, Mayor: %d\n\n", menor, mayor);
		
	}

}
