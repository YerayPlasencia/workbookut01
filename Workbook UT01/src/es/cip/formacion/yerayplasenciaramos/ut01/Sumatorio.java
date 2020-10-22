package es.cip.formacion.yerayplasenciaramos.ut01;

/**
 * Sumatorio:
 * tiene un método sumar, el cual aceptará 2 valores 
 * enteros (numero 1 y numero2) y que devolverá 
 * la suma de todo el intervalo.
 * 
 * */

public class Sumatorio {
	
	 public static int sumar(int n1, int n2){
		 
         int resultado = 0;
         
         for (int i=n1; i<=n2; i++){
                 resultado = resultado + i;
         }
               
         return resultado;
	 }
	 
	// public static void main(String[] args){
    //   int suma=sumar(1, 5);
    //   System.out.println("Ejemplo: " + suma);
	// }
}
