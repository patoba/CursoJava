public class EstudianteCienciasDeLaTierra extends Estudiante{
	public static String brujula = "Tengo una brújula";

	public EstudianteCienciasDeLaTierra(String libro, String nombre, String facultad, int edad){
		super(libro,nombre,facultad,edad);
	}
	public static void practicaDeCampo(){
		System.out.println("¡Estoy de práctica de campo!");
	}
}