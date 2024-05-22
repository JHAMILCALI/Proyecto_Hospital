import java.util.Scanner;

public class Paciente {
	private
	String id,nombre,urgencia;
	int edad,ci;
	Historial historial = new Historial();
	
	public Paciente() {
		
	}
	
	public Paciente(String id, String nombre, String urgencia, int edad, int ci, Historial historial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.urgencia = urgencia;
		this.edad = edad;
		this.ci = ci;
		this.historial = historial;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro ID Paciente: ");
		id=sc.next();
		System.out.println("Intro Nombre Paciente: ");
		nombre=sc.next();
		System.out.println("Intro Edad: ");
		edad=sc.nextInt();
		System.out.println("Intro CI: ");
		ci=sc.nextInt();
		System.out.println("Intro Urgencia: ");
		urgencia=sc.next();
		historial.leer();
	}
	void mostrar() {
		System.out.println("ID PACIENTE: "+id);
		System.out.println("Nombre Paciente: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("CI: "+ci);
		System.out.println("Urgencia: "+urgencia);
		System.out.println("\t______HISTORIAL_____");
		historial.mostrar();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

}	
