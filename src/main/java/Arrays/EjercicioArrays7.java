package Arrays;
public class EjercicioArrays7 {
	public static void main(String[] args) {
	    Persona[] personas = new Persona[10];
	    personas[0] = new Persona("Juan", "12345678A", 30);
	    personas[1] = new Persona("Maria", "87654321B", 25);
	    personas[2] = new Persona("Pedro", "98765432C", 40);
	    personas[3] = new Persona("Ana", "23456789D", 20);
	    personas[4] = new Persona("Luis", "34567890E", 50);
	    personas[5] = new Persona("Sara", "09876543F", 35);
	    personas[6] = new Persona("Javier", "45678901G", 28);
	    personas[7] = new Persona("Laura", "56789012H", 42);
	    personas[8] = new Persona("Carlos", "78901234I", 33);
	    personas[9] = new Persona("Isabel", "01234567J", 45);

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre() + " " + personas[i].getDni() + " " + personas[i].getEdad());
        }

        Persona personaMayorEdad = buscarPersonaMayorEdad(personas);
        System.out.println("La persona con mayor edad es: " + personaMayorEdad.getNombre() + " " + personaMayorEdad.getDni() + " " + personaMayorEdad.getEdad());
    }

    public static Persona buscarPersonaMayorEdad(Persona[] personas) {
        Persona mayorEdad = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if (personas[i].getEdad() > mayorEdad.getEdad()) {
                mayorEdad = personas[i];
            }
        }
        return mayorEdad;
    }
}