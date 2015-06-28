package laporan7;

public class BujurSangkar extends bentuk {
	private float sisi;
	public BujurSangkar(){
		sisi = 5;
	}
	@Override
	public float hitungluas() {
		// TODO Auto-generated method stub
		return sisi*sisi;
	}
	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Bujur Sangkar");
	}

}
