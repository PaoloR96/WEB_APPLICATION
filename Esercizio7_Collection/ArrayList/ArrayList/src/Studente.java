public class Studente {
	private String Matricola;
	private String Nome;
	private String Cognome;
	private int eta;
	//definisco il costruttore parametrico
	public Studente(String matr, String nome2, String cognome2,int eta) {
		this.Matricola=matr;
		this.Nome=nome2;
		this.Cognome=cognome2;
		this.eta=eta;
	}
/////////////---GET & SET----//////////////////////////
	public String GetMatricola() {
		return this.Matricola;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public String GetCognome() {
		return this.Cognome;
	}
	
	public int GetEtà() {
		return this.eta;
	}
	
	public void SetMatricola(String matr) {
		this.Matricola=matr;
	}
	
	public void SetNome(String nome) {
		this.Nome=nome;
	}
	public void SetCognome(String cognome) {
		this.Cognome=cognome;
	}
	public void SetEta(int eta) {
		this.eta=eta;
	}
	
}
