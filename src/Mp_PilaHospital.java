

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