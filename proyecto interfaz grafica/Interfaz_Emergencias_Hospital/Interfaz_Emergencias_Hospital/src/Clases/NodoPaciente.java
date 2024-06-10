package Clases;
public class NodoPaciente {
	private Paciente Paciente;
	private NodoPaciente ant;
	private NodoPaciente sig;
	
	NodoPaciente(){
		this.sig = null;
		this.ant = null;
	}

	public Paciente getPaciente() {
		return Paciente;
	}

	public void setPaciente(Paciente Paciente) {
		this.Paciente = Paciente;
	}

	public NodoPaciente getAnt() {
		return ant;
	}

	public void setAnt(NodoPaciente ant) {
		this.ant = ant;
	}

	public NodoPaciente getSig() {
		return sig;
	}

	public void setSig(NodoPaciente sig) {
		this.sig = sig;
	}
	
}
