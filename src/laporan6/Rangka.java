package laporan6;

public class Rangka {
	private Ban ban;
	public Rangka() {
		ban = new Ban();
		System.out.print("Konstruktor Rangka");
	}

}
class Ban {
	public Ban() {
		System.out.println("konstruktor Ban");
	}
}
