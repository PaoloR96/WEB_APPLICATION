//Costruire una sottoclasse di Persona,chiamata Stagista, che contiene 2 variabili di
//istanza di tipo intero:
//• numeropresenze, che registra il numero di ore di presenza, 
//• numeroidentificativo che registra il numero identificativo .
//• La sottoclasse deve contenere un costruttore parametrico ed i metodi set e get. 


public class Stagista extends Persona {
			private int NumeroPresenze;
			private int NumeroIdentificativo;
			Stagista(String c, String n, String cf, String citta,int np, int ni) {
					super(c,n,cf,citta);
					this.NumeroPresenze=np;
					this.NumeroIdentificativo=ni;
				}
			public void setNumeropresenze(int npr){
				NumeroPresenze=npr;
			}
			public int getNumeropresenze(){
				return NumeroPresenze;
			}
			public void setNumeroidentificativo(int idf){
			NumeroIdentificativo=idf;
			}
			public int getNumeroidentificativo(){
			return NumeroIdentificativo;
			}
} 

			

