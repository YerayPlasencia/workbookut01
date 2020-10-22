package es.cip.formacion.yerayplasenciaramos.ut01;

public class LanzarSumador {
	
	public void lanzarSumador(Integer n1,Integer n2){
		String clase="es.cip.formacion.yerayplasenciaramos.ut01.Sumatorio";
		ProcessBuilder pb;
		try {
            pb = new ProcessBuilder(
                            "java",clase,
                            n1.toString(),
                            n2.toString());
            pb.start();
		} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}
}
