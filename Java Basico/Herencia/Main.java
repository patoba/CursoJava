public class Main{
	public static void main(String[] args) {
		EstudianteCienciasDeLaTierra tony = new EstudianteCienciasDeLaTierra("Tarbuck","Toño","Ingeniería",22 );
		System.out.println(tony.toString());
		EstudianteCienciasDeLaTierra.practicaDeCampo();
		tony.estudiar();
		System.out.println("\n");
		EstudianteDerecho hilda = new EstudianteDerecho("Constitución","Hilda","Derecho",21,"Mi traje es azul") ;
		System.out.println(hilda.toString());
		hilda.estudiar();
		System.out.println(hilda.getTraje());

	}
}