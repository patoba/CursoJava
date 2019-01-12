public class Estudiante{
	private String libro;
	private String nombre;
	private String facultad;
	private int edad;

	public String toString(){
		return "Hola, soy un estudiante ;), mi libro es: "+this.libro+"\nEstudio en la facultad de: "+this.facultad+"\nMe llamo: "+this.nombre+" y tengo "+this.edad+" años.";
	}

	public Estudiante(String libro, String nombre, String facultad, int edad){
		this.libro = libro;
		this.nombre = nombre;
		this.facultad=facultad;
		this.edad = edad;
	}

	public void estudiar(){
		System.out.println("¡Estoy estudiando!");
	}
}