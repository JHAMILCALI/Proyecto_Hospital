import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Historial {
	private
	String id,diagnostico,tratamiento,notaInf;
	PilaMedicamento Medicamento = new PilaMedicamento();
	public Historial() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Historial(String id, String diagnostico, String tratamiento, String notaInf, PilaMedicamento medicamento) {
		super();
		this.id = id;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.notaInf = notaInf;
		Medicamento = medicamento;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ID Historial: ");
		id=sc.next();
		System.out.println("Introduce Diagnostico: ");
		diagnostico=sc.next();
		System.out.println("Introduce Tratamiento: ");
		tratamiento=sc.next();
		System.out.println("Introduce nota de informacion: ");
		notaInf=sc.next();
		System.out.println("\tIntroduce la cantidad de medicamentos a recetar: ");
		int cantX=sc.nextInt();
		Medicamento.llenar(cantX);
	}
	void mostrar() {
		System.out.println("ID HISTORIAL: "+id);
		System.out.println("DIAGNOSTICO: "+diagnostico);
		System.out.println("TRATAMIENTO: "+tratamiento);
		System.out.println("NOTAS DE INF: "+notaInf);
		System.out.println();
		Medicamento.mostrar();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getNotaInf() {
		return notaInf;
	}

	public void setNotaInf(String notaInf) {
		this.notaInf = notaInf;
	}

	public PilaMedicamento getMedicamento() {
		return Medicamento;
	}

	public void setMedicamento(PilaMedicamento medicamento) {
		Medicamento = medicamento;
	}
}
