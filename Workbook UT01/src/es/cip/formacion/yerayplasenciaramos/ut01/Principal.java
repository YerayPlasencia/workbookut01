package es.cip.formacion.yerayplasenciaramos.ut01;

public class Principal {

	public static void main(String[] args) {
		LanzarSumador ls = new LanzarSumador();
        ls.lanzarSumador(1, 30);
        ls.lanzarSumador(70, 100);
        System.out.println("Finalizado");
	}
}
