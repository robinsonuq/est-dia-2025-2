package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparacion {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan",20);
		Cliente cliente2 = new Cliente("Luan",30);
		
		ArrayList<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		lista.add(cliente2);
		
		Collections.sort(lista,new Comparator<Cliente>() {

			@Override
			public int compare(Cliente o1, Cliente o2) {
				// TODO Auto-generated method stub
				return o1.getEdad()-o2.getEdad();
			}
		});
		
		Collections.max(lista);
	}
}
