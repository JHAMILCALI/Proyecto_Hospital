package Clases;
public class ListaSimplePlanta{
	protected NodoPlanta P;  //raiz de la lista
	
	public ListaSimplePlanta() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPlanta getP() {
		return P;
	}

	public void setP(NodoPlanta p) {
		P = p;
	}
	
}
