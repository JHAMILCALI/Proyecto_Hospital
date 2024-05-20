import javax.print.Doc;

public class Principal {
	public static void main(String[] args) {
		PilaMedicamento PM = new PilaMedicamento();
		PM.adi(new Medicamento("Paracetamol",3,"Cada 8 horas"));
		PM.adi(new Medicamento("Hidriax",45,"Despuede de cada comida"));
		
		Historial H = new Historial("123A","Normal","Topico","Se le acoseja no exponerse al sol.",PM);
		
		LD_NormalCita C = new LD_NormalCita();
		C.adiFinal(new Cita("123AB","12/04/2023","12:30","Rostro",H));
		//C.mostrar();
		
		Paciente P1 = new Paciente("123ABC1","Jose","Leve",19,89765356,C);
		Paciente P2 = new Paciente("23475","mimi","Leve",19,89765356,C);
		
		LD_NormalPaciente P = new LD_NormalPaciente();
		
		P.adiFinal(P1);
		P.adiFinal(P2);
		//P.mostrar();
		LD_CircularDoctor doc = new LD_CircularDoctor();
		doc.adiFinal(new Doctor("Tarde","Neytan","Cirujano",762537738,20));

		
		LS_CircularCama cama = new LS_CircularCama();
		cama.adiFinal(new Cama("si","123","3245"));
		//cama.mostrar();
		ColaCircularEnfermera en = new ColaCircularEnfermera();
		en.adi(new Enfermera("Ana","Tarde"));
		en.adi(new Enfermera("Juana","Mañana"));
		en.adi(new Enfermera("Laura","Noche"));
		
		PilaSala_Atencion SA = new PilaSala_Atencion();
		SA.adi(new Sala_Atencion("QUIROFANO","2233ab",P,en,cama));
		LS_NormalPlanta pla = new LS_NormalPlanta();
		
		LD_CircularConsultorio con = new LD_CircularConsultorio();
		con.adiFinal(new Consultorio("QUIROFANO","62532AB",doc));
		pla.adiFinal("P1",con , SA);
		Mp_PilaHospital MPHos = new Mp_PilaHospital();
		MPHos.adicionar(0, new Hospital("SANTA SALUD", "Miraflores AV.lupe", 67263883, pla));
		MPHos.setNp(2);
		MPHos.mostrar();
		
	}
	
}
