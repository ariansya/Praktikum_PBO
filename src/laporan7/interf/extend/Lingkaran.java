package laporan7.interf.extend;

public class Lingkaran implements hitungluas, hitungkeliling{

	private double jarijari;
	public Lingkaran(double jarijari){
		this.jarijari = jarijari;
	}
	
	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Lingkaran");
	}

	@Override
	public double hitungkeliling() {
		// TODO Auto-generated method stub
		return 2*PHI*jarijari;
	}

	@Override
	public double hitungluas() {
		// TODO Auto-generated method stub
		return PHI*Math.pow(jarijari, 2);
	}

}
