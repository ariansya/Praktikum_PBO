package Laporan8;

public class CobaEksepsi {
	
	public static void cobaMetode(int i) {
		if (i>=0) {
			throw new CobaRunTimeException();
		}
		System.out.println("Nilai i = " +i);
	}
	
	public static void cobaMetodeDua(int i) throws CobaCheckedExpection {
		if (i>=0) {
			throw new CobaCheckedExpection();
		}
		System.out.println("Nilai i =" + i);
	}
	
	public static void main(String args[]) {
		try {
			cobaMetode(-2);
			cobaMetodeDua(3);
		}
		catch (CobaRunTimeException e) {
			System.out.println(e.getMessage());
		}
		catch (CobaCheckedExpection e) {
			System.out.println(e.getMessage());
		}
	}

}
