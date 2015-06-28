package laporan5;

public class orang {
	public String nama;
	public String alamat;
	public int tinggibadan;
	public float beratbadan;
	
	public void cetakorang(){
		System.out.println(nama + ","+ alamat +","+ tinggibadan+","+beratbadan);
	}
	public static void main(String[]args){
		orang objekorang = new orang();
		objekorang.nama = "ADRI";
		objekorang.alamat = "MAMUJU";
		objekorang.tinggibadan = 168;
		objekorang.beratbadan = 70.4f;
		objekorang.cetakorang();
		
		orang objekorang1 = new orang();
		objekorang1.nama = "INDAH";
		objekorang1.alamat = "MAMUJU";
		objekorang1.tinggibadan = 158;
		objekorang1.beratbadan = 50.4f;
		objekorang1.cetakorang();
		
	}
}
