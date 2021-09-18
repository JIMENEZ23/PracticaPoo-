package co.edu.poli.poo.clases;

public class CrearPerro {
	public static void main(String args[]) {
		//crear una instancia de clase perro
		//Declaracion
		Perro p1;
		//inicializacion
		p1 = new Perro();
		p1.setNombre("Rocky");
		p1.setRaza("Bulldog");
		
		System.out.println(p1.getNombre());
		
		Perro miPerro;
		miPerro = new Perro("Mia");
		miPerro.setPeso(5);
		
		System.out.println(miPerro.getNombre()+ " "+miPerro.getPeso());
		
	}
	
}
