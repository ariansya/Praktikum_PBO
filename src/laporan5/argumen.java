package laporan5;

public class argumen {
	public static void passingprimitif(int i){
		i = 5;
	}
	public static void passingObject(Titik t){
		t.x = 4;
		t.y = 5;
	}
	public static void main (String[]args){
		int i =5;
		passingprimitif(i);
		System.out.println(i);
		
		Titik t = new Titik();
		passingObject(t);
		System.out.println(t.x+" "+t.y);
	}

}
class Titik {
	public int x;
	public int y;
	
	public Titik(){
		x=0;
		y=0;
	}
}
