package recursividad;

public class Matriuska {

	public static void main(String[] args) {
		
		int resultado = sumar(5);
		System.out.println(resultado);
	}

	
	
	public int sumaRecursiva (int[]arreglo,int inicio,int fin) {
		if(inicio == fin) {
			return arreglo[inicio];
		}else {
			int mitad = (inicio + fin)/2;
			int izq = sumaRecursiva(arreglo,inicio,mitad);
			int der = sumaRecursiva(arreglo,mitad+1,fin);
			
			return izq + der;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	private static int sumar(int n) {
		if(n == 0) {
			return 0;
		}else {
			return  n + sumar(n -1);
		}
	}

	
	
	
	
	private static void matriuska(int n) {
	
		//caso base 
		if(n == 0) {
			System.out.println("Termine");
		}else {
			System.out.println("Abriendo matriuska "+n);
			matriuska(n - 1);
			System.out.println("Cerrando matriuska "+n);
		}
		
	}
}
