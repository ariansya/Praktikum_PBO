package laporan7.coba;

import laporan7.bentuk;
import laporan7.BujurSangkar;
import laporan7.segitigasamakaki;
import laporan7.segitigasamasisi;
public class cobabentuk {
	public static void cetakbangun(bentuk b){
		System.out.println(b.hitungluas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[]args){
		cetakbangun(new BujurSangkar());
		cetakbangun(new segitigasamakaki());
		cetakbangun(new segitigasamasisi());
	}

}
