package Clases;
public class VectorSala_Atencion {
	protected
	int max=50;
	Sala_Atencion v[] = new Sala_Atencion[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Sala_Atencion[] getV() {
		return v;
	}
	public void setV(Sala_Atencion[] v) {
		this.v = v;
	}
}
