package Clases;

import java.util.Scanner;
public class Mp_PilaHospital {

	PilaHospital mp[] = new PilaHospital[20];
	int n = 0;
	Mp_PilaHospital() {
		int i;
		for (i = 0; i < 20; i++)
			mp[i] = new PilaHospital();
	}

	int Nropilas() {
		return (n);
	}

	int nroelem(int i) {
		return (mp[i].nroElem());
	}

	boolean esvacia(int i) {
		if (mp[i].esVacia())
			return true;
		return false;
	}

	boolean esllena(int i) {
		if (mp[i].esLlena())
			return true;
		return false;
	}

	void adicionar(int i, Hospital L) {
		if (!mp[i].esLlena())
			mp[i].adi(L);
		else
			System.out.print("pila " + i + " esta llena");
	}
        void leer(){
            //tipos de urgencia
		//Emergencia, urgencia,atencion Prioritaria,conuslta general
		//======PACIENTE 1=================
		PilaMedicamento P1M1 = new PilaMedicamento();
		P1M1.adi(new Medicamento("Paracetamol","Cada 8 horas",4,3));
		P1M1.adi(new Medicamento("Hidriax","Despuede de cada comida",45,10));
		PilaMedicamento P1M2 = new PilaMedicamento();
		P1M2.adi(new Medicamento("Protector solar","Al salir a la calle ponerse en el rostro",1,90));
		//--------CITA P1----------
		LD_NormalCita Ci1 = new LD_NormalCita();
		Ci1.adiFinal(new Cita("123AB","12/04/2023","12:30","Rostro","Se le acoseja no exponerse al sol.","Neytan",P1M1));
		Ci1.adiFinal(new Cita("124AB","12/03/2023","14:45","Rostro","Se le acoseja usara protector solar","Neytan",P1M2));
		//-------HISTORILA P1-------
		Historial H1 = new Historial("123A","Normal","Topico",Ci1);
		Paciente P1 = new Paciente("123ABC1","Jose","Atencion prioritaria",19,89765356,H1);
		
		//======PACIENTE 2=================
		PilaMedicamento P2M1 = new PilaMedicamento();
		P2M1.adi(new Medicamento("Inhibidores ","Cada 12 horas",40,7));
		P2M1.adi(new Medicamento("Losartán","En la mañana despues del desayuno",20,13));
		PilaMedicamento P2M2 = new PilaMedicamento();
		P2M2.adi(new Medicamento("Metoprolol","En las noches antes de dormir",34,4));
		//--------CITA P2----------
		LD_NormalCita Ci2 = new LD_NormalCita();
		Ci2.adiFinal(new Cita("223AB","05/09/2023","14:30","Corazon","Se le acoseja no tener muchas alteraciones","Jorge",P2M1));
		Ci2.adiFinal(new Cita("224AB","06/11/2023","14:45","Corazon","Se le acoseja baja en grasas saturadas y trans","Jorge",P2M2));
		//-------HISTORILA P2-------
		Historial H2 = new Historial("123A","Normal","Topico",Ci2);
		Paciente P2 = new Paciente("23475","Jhamil","Leve",43,764627279,H2);
		
		
		LD_NormalPaciente Pa1 = new LD_NormalPaciente();
		Pa1.adiFinal(P1);
		
		
		LD_NormalPaciente Pa2 = new LD_NormalPaciente();
		Pa2.adiFinal(P2);
		Pa2.adiFinal(new Paciente("23475","Maria","Urgencia",43,764627279,H1));
		Pa2.adiFinal(new Paciente("23475","Juana","Emergencia",43,764627279,H1));
		Pa2.adiFinal(new Paciente("23475","Chelo","Urgencia",43,764627279,H1));
		Pa2.adiFinal(new Paciente("23475","Lupe","Emergencia",43,764627279,H1));
		Pa2.adiFinal(new Paciente("23475","Angela","consulta general",43,764627279,H1));
		//P.mostrar();
		LD_CircularDoctor doc1 = new LD_CircularDoctor();
		doc1.adiFinal(new Doctor("Mañana","Neytan","Dermatologo",762537738,20));
		LD_CircularDoctor doc2 = new LD_CircularDoctor();
		doc2.adiFinal(new Doctor("Tarde","Jorge","Cardiólogo ",877364774,34));

		LS_CircularCama cama1 = new LS_CircularCama();
		cama1.adiFinal(new Cama("si","123","0"));
		cama1.adiFinal(new Cama("no","124","0"));
		
		LS_CircularCama cama2 = new LS_CircularCama();
		cama2.adiFinal(new Cama("no","223","23475"));
		cama2.adiFinal(new Cama("si","224","0"));
		cama2.adiFinal(new Cama("si","225","0"));
		cama2.adiFinal(new Cama("si","226","0"));
		
		ColaCircularEnfermera en1 = new ColaCircularEnfermera();
		en1.adi(new Enfermera("Abril","Mañana"));
		
		ColaCircularEnfermera en2 = new ColaCircularEnfermera();
		en2.adi(new Enfermera("Ana","Tarde"));
		en2.adi(new Enfermera("Juana","Mañana"));
		en2.adi(new Enfermera("Laura","Noche"));
		
		PilaSala_Atencion SA1 = new PilaSala_Atencion();
		SA1.adi(new Sala_Atencion("Dermatologia","1233ab",Pa1,en1,cama1));
		SA1.adi(new Sala_Atencion("Cardiólogia","2233ab",Pa2,en2,cama2));
		LS_NormalPlanta pla = new LS_NormalPlanta();
		
		LD_CircularConsultorio con = new LD_CircularConsultorio();
		con.adiFinal(new Consultorio("Dermatologia","62532AC",doc1));
		con.adiFinal(new Consultorio("Cardiólogia","62532AB",doc2));
		pla.adiFinal("P1",con , SA1);
		//-------------------------------------------------------------
		//======PACIENTE 3=================
		PilaMedicamento P3M1 = new PilaMedicamento();
		P3M1.adi(new Medicamento("Aspirina","Cada 12 horas",30,5));
		P3M1.adi(new Medicamento("Clopidogrel","En la mañana con el desayuno",60,1));
		PilaMedicamento P3M2 = new PilaMedicamento();
		P3M2.adi(new Medicamento("Simvastatina","En la noche antes de dormir",40,30));
		//--------CITA P3----------
		LD_NormalCita Ci3 = new LD_NormalCita();
		Ci3.adiFinal(new Cita("323AB","15/08/2023","10:00","Corazón","Se le aconseja continuar con la medicación","Carlos",P3M1));
		Ci3.adiFinal(new Cita("324AB","20/09/2023","09:45","Corazón","Se le aconseja realizar ejercicios moderados","Carlos",P3M2));
		//-------HISTORIAL P3-------
		Historial H3 = new Historial("223A","Normal","Cardiología",Ci3);
		Paciente P3 = new Paciente("34567","María","Moderado",58,789654321,H3);

		//======PACIENTE 4=================
		PilaMedicamento P4M1 = new PilaMedicamento();
		P4M1.adi(new Medicamento("Ibuprofeno","Cada 8 horas",25,7));
		P4M1.adi(new Medicamento("Amoxicilina","Cada 12 horas",14,21));
		PilaMedicamento P4M2 = new PilaMedicamento();
		P4M2.adi(new Medicamento("Loratadina","En la mañana y noche",10,15));
		//--------CITA P4----------
		LD_NormalCita Ci4 = new LD_NormalCita();
		Ci4.adiFinal(new Cita("423AB","22/11/2023","11:15","Infección","Se le aconseja terminar el antibiótico","Ana",P4M1));
		Ci4.adiFinal(new Cita("424AB","29/11/2023","10:45","Alergia","Se le aconseja evitar alérgenos comunes","Ana",P4M2));
		//-------HISTORIAL P4-------
		Historial H4 = new Historial("323A","Normal","Infectología",Ci4);
		Paciente P4 = new Paciente("45678","Luis","Leve",34,123456789,H4);

		LD_NormalPaciente Pa3 = new LD_NormalPaciente();
		Pa3.adiFinal(P3);

		LD_NormalPaciente Pa4 = new LD_NormalPaciente();
		Pa4.adiFinal(P4);

		//======PACIENTE 5=================
		PilaMedicamento P5M1 = new PilaMedicamento();
		P5M1.adi(new Medicamento("Insulina","Antes de cada comida",10,30));
		P5M1.adi(new Medicamento("Metformina","Con el desayuno y la cena",50,90));
		PilaMedicamento P5M2 = new PilaMedicamento();
		P5M2.adi(new Medicamento("Enalapril","En la mañana",20,60));
		//--------CITA P5----------
		LD_NormalCita Ci5 = new LD_NormalCita();
		Ci5.adiFinal(new Cita("523AB","01/10/2023","09:00","Diabetes","Se le aconseja controlar su dieta","Marta",P5M1));
		Ci5.adiFinal(new Cita("524AB","15/10/2023","10:30","Hipertensión","Se le aconseja hacer ejercicio regular","Marta",P5M2));
		//-------HISTORIAL P5-------
		Historial H5 = new Historial("423A","Normal","Endocrinología",Ci5);
		Paciente P5 = new Paciente("56789","Andrea","Severo",45,987654321,H5);

		LD_NormalPaciente Pa5 = new LD_NormalPaciente();
		Pa5.adiFinal(P5);

		//======PACIENTE 6=================
		PilaMedicamento P6M1 = new PilaMedicamento();
		P6M1.adi(new Medicamento("Loratadina","En la mañana",10,15));
		P6M1.adi(new Medicamento("Montelukast","En la noche",30,90));
		PilaMedicamento P6M2 = new PilaMedicamento();
		P6M2.adi(new Medicamento("Salbutamol","En caso de crisis asmática",15,200));
		//--------CITA P6----------
		LD_NormalCita Ci6 = new LD_NormalCita();
		Ci6.adiFinal(new Cita("623AB","12/12/2023","14:00","Alergias","Se le aconseja evitar alérgenos","Juan",P6M1));
		Ci6.adiFinal(new Cita("624AB","20/12/2023","11:30","Asma","Se le aconseja llevar el inhalador siempre","Juan",P6M2));
		//-------HISTORIAL P6-------
		Historial H6 = new Historial("523A","Normal","Neumología",Ci6);
		Paciente P6 = new Paciente("67890","Carlos","Leve",25,654321987,H6);

		LD_NormalPaciente Pa6 = new LD_NormalPaciente();
		Pa6.adiFinal(P6);

		// Doctores
		LD_CircularDoctor doc3 = new LD_CircularDoctor();
		doc3.adiFinal(new Doctor("Mañana","Carlos","Cardiólogo",987654321,15));

		LD_CircularDoctor doc4 = new LD_CircularDoctor();
		doc4.adiFinal(new Doctor("Tarde","Ana","Infectóloga",876543210,22));

		LD_CircularDoctor doc5 = new LD_CircularDoctor();
		doc5.adiFinal(new Doctor("Mañana","Marta","Endocrinóloga",765432109,18));

		LD_CircularDoctor doc6 = new LD_CircularDoctor();
		doc6.adiFinal(new Doctor("Tarde","Juan","Neumólogo",654321098,25));

		// Camas
		LS_CircularCama cama3 = new LS_CircularCama();
		cama3.adiFinal(new Cama("si","323","0"));
		cama3.adiFinal(new Cama("si","324","0"));

		LS_CircularCama cama4 = new LS_CircularCama();
		cama4.adiFinal(new Cama("no","423","34567"));
		cama4.adiFinal(new Cama("si","424","0"));
		cama4.adiFinal(new Cama("si","425","0"));
		cama4.adiFinal(new Cama("si","426","0"));

		LS_CircularCama cama5 = new LS_CircularCama();
		cama5.adiFinal(new Cama("si","523","0"));
		cama5.adiFinal(new Cama("no","524","56789"));

		LS_CircularCama cama6 = new LS_CircularCama();
		cama6.adiFinal(new Cama("no","623","67890"));
		cama6.adiFinal(new Cama("si","624","0"));

		// Enfermeras
		ColaCircularEnfermera en3 = new ColaCircularEnfermera();
		en3.adi(new Enfermera("Beatriz","Mañana"));

		ColaCircularEnfermera en4 = new ColaCircularEnfermera();
		en4.adi(new Enfermera("Diana","Tarde"));
		en4.adi(new Enfermera("Elena","Mañana"));
		en4.adi(new Enfermera("Felicia","Noche"));

		ColaCircularEnfermera en5 = new ColaCircularEnfermera();
		en5.adi(new Enfermera("Gabriela","Mañana"));

		ColaCircularEnfermera en6 = new ColaCircularEnfermera();
		en6.adi(new Enfermera("Hilda","Tarde"));
		en6.adi(new Enfermera("Irene","Noche"));

		// Salas de atención
		PilaSala_Atencion SA2 = new PilaSala_Atencion();
		SA2.adi(new Sala_Atencion("Cardiología","3233ab",Pa3,en3,cama3));
		SA2.adi(new Sala_Atencion("Infectología","4233ab",Pa4,en4,cama4));

		PilaSala_Atencion SA3 = new PilaSala_Atencion();
		SA3.adi(new Sala_Atencion("Endocrinología","5233ab",Pa5,en5,cama5));
		SA3.adi(new Sala_Atencion("Neumología","6233ab",Pa6,en6,cama6));

		LS_NormalPlanta pla2 = new LS_NormalPlanta();

		// Consultorios
		LD_CircularConsultorio con2 = new LD_CircularConsultorio();
		con2.adiFinal(new Consultorio("Cardiología","72532AC",doc3));
		con2.adiFinal(new Consultorio("Infectología","72532AB",doc4));
		con2.adiFinal(new Consultorio("Endocrinología","72532AD",doc5));
		con2.adiFinal(new Consultorio("Neumología","72532AE",doc6));

		pla2.adiFinal("P2",con2, SA2);
		pla2.adiFinal("P3",con2, SA3);
		
                Mp_PilaHospital MPHos = new Mp_PilaHospital();
		MPHos.adicionar(0, new Hospital("SANTA SALUD", "Miraflores AV.lupe", 67263883, pla));
		MPHos.adicionar(1, new Hospital("PRO SALUD", "San Miguel AV.lupe", 67263883, pla2));
		MPHos.setNp(2);
		MPHos.mostrar();
        }

	Hospital eliminar(int i) {
		Hospital e = new Hospital();
		if (!mp[i].esVacia())
			e = mp[i].eli();
		else
			System.out.print("pila " + i + " esta vacia");
		return e;
	}

	void mostrar(int i) {
		mp[i].mostrar();
	}

	void mostrar() {
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("\n\t=======Datos Pila " + i + " ========== ");
			mp[i].mostrar();
		}
	}

	void vaciar(int i, PilaHospital z) {
		mp[i].vaciar(z);
	}

	public PilaHospital[] getMp() {
		return mp;
	}

	public void setMp(PilaHospital[] mp) {
		this.mp = mp;
	}

	

	public int getNp() {
		return n;
	}

	public void setNp(int np) {
		this.n = np;
	}

	

}