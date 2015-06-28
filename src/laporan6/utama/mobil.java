package laporan6.utama;
import laporan6.Rangka;
import laporan6.mesin;
public class mobil {
	private Rangka rangka;
	private laporan6.mesin Mesin;
	
	public mobil(){
		rangka = new Rangka();
		Mesin = new mesin();
	}
	
	public static void main(String args[]){
		new mobil();
	}

}
