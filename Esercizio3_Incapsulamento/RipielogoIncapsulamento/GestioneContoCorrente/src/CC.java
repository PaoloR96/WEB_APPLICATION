///Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
//Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire 
//il saldo e di effettuare la lista dei movimenti .



public class CC {
	private double Conto=0;
	private char T[] = new char[20];
	private int i=0;
	public void SetVersamento(double somma) {
		this.Conto=somma+ this.Conto;
		T[i]='v';
		i++;
		System.out.print("Versamento Erogato!!");
		System.out.println(" ");
	}
	public void GetPrelievo(double somma1) {
		if(somma1>this.Conto) {
			System.out.print("Non puoi prelavare questa somma!!");
			System.out.println(" ");
			
		}else {
			this.Conto=+ this.Conto-somma1;
			T[i]='p';
			i++;
			System.out.print("Prelievo Effettuato!!");
			System.out.println();
		}

	}
	public double GetSaldo() {
		
		T[i]='s';
		i++;
		return this.Conto;
		// TODO Auto-generated method stub
		
	}
	public void GetMovimento() {
		for(int k=0;k<i;k++) {
			System.out.print(T[k]);
			System.out.println();
		}
		
	}
}
