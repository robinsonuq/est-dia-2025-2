package recursividad;

public class Parametros {

	
	public static void main(String[] args) {
	
		
		Persona persona = new Persona("Andrea");
		cambiarNombre(persona);
		System.out.println(persona.getNombre());
	}

	private static Persona cambiarNombre(Persona miEx) {
		miEx.setNombre("Carlos");
		return miEx;
	}

	
	
}
