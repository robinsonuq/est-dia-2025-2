package recursividad;

import java.util.ArrayList;

public class Recursividad {


	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);

		imprimirRecursivo(lista,0);
	}

	private static void imprimirRecursivo(ArrayList<Integer> lista, int i) {

		if(i == lista.size()-1){
			System.out.println("Numero :"+lista.get(i));
			System.out.println("termina");
		}else{
			imprimirRecursivo(lista, i + 1);
			System.out.println("Numero :"+lista.get(i));
		}

	}
}
