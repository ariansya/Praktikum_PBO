package laporan5;

public class Hewan {
	public static int JUMLAH_HEWAN = 0;
	public String spesies;
	
	public static void tambahhewan(){
		JUMLAH_HEWAN++;
	}
	public static void main(String[]arg){
		Hewan objekhewan = new Hewan();
		objekhewan.spesies = "Kucing";
		Hewan.tambahhewan();
		System.out.println(Hewan.JUMLAH_HEWAN);
		
		Hewan objekhewan1 = new Hewan();
		objekhewan1.spesies = "Anjing";
		Hewan.tambahhewan();
		System.out.println(Hewan.JUMLAH_HEWAN);
		
		System.out.println(objekhewan.JUMLAH_HEWAN);
		System.out.println(objekhewan1.JUMLAH_HEWAN);
	}

}
