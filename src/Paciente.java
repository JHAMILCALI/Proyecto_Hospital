import java.util.Scanner;

public class Paciente {
	private
	String id,nombre,urgencia;
	int edad,ci;
	LD_NormalCita cita = new LD_NormalCita();
	
	public Paciente() {
		
	}
	
	public Paciente(String id, String nombre, String urgencia, int edad, int ci, LD_NormalCita cita) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.urgencia = urgencia;
		this.edad = edad;
		this.ci = ci;
		this.cita = cita;
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
		System.out.println("\tINTRODUCE LA CANTIDAD DE CITAS");
		int cantX=sc.nextInt();
		cita.leer1(cantX);
	}
	void mostrar() {
		System.out.println("ID PACIENTE: "+id);
		System.out.println("Nombre Paciente: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("CI: "+ci);
		System.out.println("Urgencia: "+urgencia);
		cita.mostrar();
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

	public LD_NormalCita getCita() {
		return cita;
	}

	public void setCita(LD_NormalCita cita) {
		this.cita = cita;
	}
	
	
}	
