package laporan7.interf.extend;

import laporan7.interf.bentukkeliling;
import laporan7.interf.bentukluas;
import laporan7.interf.lingkaran;

public class cobainterface {
	public static double hitungluasbentuk(bentukluas b){
		return b.hitungluas();
	}
	public static double hitungkelilingbentuk(bentukkeliling b){
		return b.hitungkeliling();
	}
	public static void main(String[]args){
		bentukinterface bentuk = new Lingkaran(3.0);
		System.out.println(hitungluasbentuk((bentukluas)bentuk));
		System.out.println(hitungkelilingbentuk((bentukkeliling)bentuk));
	}

}
