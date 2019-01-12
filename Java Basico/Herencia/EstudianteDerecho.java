public class EstudianteDerecho extends Estudiante{
	public String trajecito;

	public EstudianteDerecho(String libro, String nombre, String facultad, int edad,String trajecito){
		super(libro,nombre,facultad,edad);
		this.trajecito = trajecito;
	}

	public void estudiar(){
		System.out.println("¡Estoy leyendo la Constitución!");
	}

	public String getTraje(){
		return this.trajecito;
	}

}