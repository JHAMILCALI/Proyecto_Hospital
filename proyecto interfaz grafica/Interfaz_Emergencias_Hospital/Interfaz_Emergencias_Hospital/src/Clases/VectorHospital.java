package Clases;
public class VectorHospital {
	protected
	int max=50;
	Hospital v[] = new Hospital[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Hospital[] getV() {
		return v;
	}
	public void setV(Hospital[] v) {
		this.v = v;
	}
}
