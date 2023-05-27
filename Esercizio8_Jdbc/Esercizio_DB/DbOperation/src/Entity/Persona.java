package Entity;

public class Persona {
	private String codiceFiscale;
	private String Nome;
	private String Cognome;
	public Persona(String codf, String nome, String cognome) {
		    
		   this.codiceFiscale=codf;
		   this.Nome=nome;
		   this.Cognome=cognome;
	}
	//--------------set & get-------------------------//
	public void SetCodiceFiscale(String CodF) {
		this.codiceFiscale=CodF;
	}
	public void SetNome(String nome) {
		this.Nome=nome;
	}
	public void SetCognome(String cognome) {
		this.Cognome=cognome;
	}
	public String GetCodFiscale() {
		return this.codiceFiscale;
	}
	public String GetNome() {
		return this.Nome;
	}
	public String GetCognome() {
		return this.Cognome;
	}
/////////////---------Metodi----------//////////////////
	 public String toString() {
		 String s="Persona [Codice Fiscale=" + codiceFiscale + ",Nome=" + Nome + ",Cognome=" + Cognome + "]";
		 return s;
		 
		 
	 }
}
