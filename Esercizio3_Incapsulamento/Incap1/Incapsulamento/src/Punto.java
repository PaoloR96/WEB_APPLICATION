
public class Punto {
	private int x=0;
	private int y=0;
	private final int VALORE_MASSIMO_PER_X=10;
	private final int VALORE_MINIMO_PER_X=-10;
	private final int VALORE_MASSIMO_PER_Y=10;
	private final int VALORE_MINIMO_PER_Y=-10;
	public void SetX(int a) {
		if(a <= VALORE_MASSIMO_PER_X && a >=VALORE_MINIMO_PER_X){ 
			x=a;
			System.out.println(a+" rientra nell'intervallo!");
		}else {
			System.out.println(a+"non rientra nell'intervallo!");
			
		}
	
	}
	public void SetY(int a) {
		if(a <= VALORE_MASSIMO_PER_Y && a >=VALORE_MINIMO_PER_Y) {
			y=a;
			System.out.println(a+" rientra nell'intervallo!");
		}else {
			System.out.println(a+"non rientra nell'intervallo!");
			
		}
	
	}

}
