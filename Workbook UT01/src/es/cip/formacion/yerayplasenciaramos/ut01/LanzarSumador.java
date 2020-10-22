package es.cip.formacion.yerayplasenciaramos.ut01;

/**
 * LanzarSumador:
 * donde se crear� el objeto a la clase Sumatorio y 
 * llamar� a su m�todo sumar pasandole 2 valores 
 * enteros recibidos por par�metros
 * 
 * */

public class LanzarSumador {
	
	public void lanzarSumador(Integer n1,Integer n2){
		
		String clase="es.cip.formacion.yerayplasenciaramos.ut01.Sumatorio";
		ProcessBuilder pb;
		
		try {
			
            pb = new ProcessBuilder("java",clase,n1.toString(),n2.toString());
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            pb.start();
            
		} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}
}
