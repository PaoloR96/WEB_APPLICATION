//Realizza un programma che sia in grado di valutare il volume di oggetti tridimensionali 
//come cilindri e parallelepipedi basandosi sul valore della loro area e dell'altezza. 
//Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta .
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cilindro cl=new Cilindro(4,5);
		//System.out.print(cl.CalcolaArea());
		System.out.println();
		Parallelepipedo pl=new Parallelepipedo (4,5);
		//System.out.print(pl.CalcolaArea());
		pl.StampaArea();
		System.out.println();
		pl.StampaVolume();
		

	}

}