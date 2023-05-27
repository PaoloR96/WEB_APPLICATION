import java.util.List;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

import DbConnection.*;
import Entity.Persona;
import Controller.*;


import java.io.IOException;

import java.io.InputStreamReader;
import java.io.Reader;
public class Main {

	public static void main(String[] args){
		int scelta=0;
		Scanner scan = new Scanner(System.in);
		Controller controller =new Controller();
		do {
			System.out.println();
			System.out.print("Menu'");
			System.out.println();
			System.out.print("1)Aggiungi Persona");
			System.out.println();
			System.out.print("2)Cancella Peronsa");
			System.out.println();
			System.out.print("3)Stampa elenco Persone");
			System.out.println();
			System.out.print("4)Uscita");
			System.out.println();
			System.out.print("Definire l'operazione da effettuare:");
			scelta =scan.nextInt();
			
			switch(scelta) {
						
					case 1:
				
						System.out.println();
						System.out.print("Inserimento CodFis:");
						String CodiceFiscale =scan.next();
						System.out.println();
						System.out.print("Inserimento Nome:");
						String Nome = scan.next();
						System.out.println();
						System.out.print("Inserimento Cognome:");
						String Cognome = scan.next();
						System.out.println();
						Persona p1= new Persona(CodiceFiscale,Nome,Cognome);
						controller.AggiungiPersona(p1);
						break;
			
					case 2:
						
						System.out.println();
						System.out.print("Inserire il CodiceFiscale della persona da rimuovere:");
						CodiceFiscale =scan.next();
						controller.CancellaPersona(CodiceFiscale);
						break;
			
					case 3:
				
						List<Persona> lsPers =controller.ListaPersona(); 
						for (Persona allPers : lsPers) {
								System.out.println(allPers);
						}
						break;
				
			
			}
			
			
		}while(scelta!=4);
	
			
		
	}

}
