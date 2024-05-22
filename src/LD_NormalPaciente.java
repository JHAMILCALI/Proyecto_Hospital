
//Lic Aruquipa Marcelo
public class LD_NormalPaciente extends ListaDoblePaciente{
	public LD_NormalPaciente() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoPaciente R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Paciente z){
		NodoPaciente nuevo = new NodoPaciente();
		nuevo.setPaciente(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoPaciente R = P;
		System.out.println("\t*****LISTA DE PACIENTES******");
		int cont=1;
		while(R != null) {
			System.out.println("\tPACIENTE ["+cont+"]");
			R.getPaciente().mostrar();
			cont++;
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(Paciente z) {
		NodoPaciente nuevo =  new NodoPaciente();
		nuevo.setPaciente(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoPaciente R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoPaciente eliPrimero() {
		NodoPaciente x = new NodoPaciente();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoPaciente eliFinal() {
		NodoPaciente x = new NodoPaciente();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoPaciente R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoPaciente aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Paciente z = new Paciente();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Paciente z = new Paciente();
			z.leer();
			adiFinal(z);
		}
	}
}
