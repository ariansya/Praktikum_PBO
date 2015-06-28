package laporan7.interf;

public class lingkaran implements bentukluas, bentukkeliling{
	private double jarijari;

	@Override
	public double hitungkeliling() {
		// TODO Auto-generated method stub
		return 2*bentukkeliling.PHI*jarijari;
	}
	@Override
	public double hitungluas() {
		// TODO Auto-generated method stub
		return bentukluas.PHI*Math.pow(jarijari, 2);
	}

}
