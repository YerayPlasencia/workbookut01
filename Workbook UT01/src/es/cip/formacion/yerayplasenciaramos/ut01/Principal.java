package es.cip.formacion.yerayplasenciaramos.ut01;

/**
 * Principal:
 * Clase principal del programa.
 * 
 * */

public class Principal {

	public static void main(String[] args) {
		
		LanzarSumador ls = new LanzarSumador();
		
		System.out.println("Primer Lanzamiento");
        ls.lanzarSumador(1, 30);
        System.out.println("Segundo Lanzamiento");
        ls.lanzarSumador(70, 100);
        
        System.out.println("\nFinalizado OK");
	}
}
