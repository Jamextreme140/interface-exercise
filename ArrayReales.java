package exercise;

public class ArrayReales implements Statistics {
	
	private double[] a;
	private int b;
	private double suma;
	
	public ArrayReales(double[] a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double minimum() {
		return a[0];
	}

	@Override
	public double maximum() {
		return a[b];
	}

	@Override
	public double sumatorio() {
		for(int i = 0; i <= a.length; i++) {
			suma += a[i];
		}
		return suma;
	}

}
