
///. Si scriva una classe Persona dotata dei campi CodiceFiscale, Nome, Cognome 
//e dei metodi per impostare e leggere tali valori. 
//La classe inoltre dovrà essere dotata del metodo toString(). 
//Si definisca poi una classe Studente come estensione di Persona; 
//i campi aggiuntivi di Studente rispetto a Persona sono matricola e università. 
//Inoltre la classe Studente dovrà avere i metodi per impostare e leggere tali campi
//e dovrà sovrascrivere il metodo toString(). 

//Si definisca infine la classe Docente che estende
//Persona con campi aggiuntivi materia e salario. Anche in questo caso la classe dovrà avere
//metodi per leggere e impostare i vari attributi e dovrà sovrascrivere il metodo toString().


public class main {

	public static void main(String[] args) {
		Persona p1= new Persona("RSSPLA96A31E932R","Paolo","Russo");
		//String s=p1.toString();
		//System.out.print(s);
		Studente s1= new Studente("RSSPLA96A31E932R","Paolo","Russo","n46002315","Federico II");
		String s=s1.toString();
		System.out.print(s);
		System.out.println();
		Docente d1= new Docente("BRCBRT95C08E932R","Bartolomeo","Braccio","Programmazione 1",3000);
		String s11=d1.toString();
		System.out.print(s11);

	}

}
