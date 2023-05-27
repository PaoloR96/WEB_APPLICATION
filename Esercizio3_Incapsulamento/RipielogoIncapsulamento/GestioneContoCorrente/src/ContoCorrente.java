///Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
//Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire 
//il saldo e di effettuare la lista dei movimenti .

import java.io.*;
import java.util.Scanner;
public class ContoCorrente {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char scelta;
			//istanzio oggetto CC
			CC c1= new CC();
			System.out.print("-------Menu' Contestuale-----------------");
			System.out.println();
			System.out.print("v - Versamento");
			System.out.println();
			System.out.print("p - Prelievo");
			System.out.println();
			System.out.print("s - Saldo");
			System.out.println();
			System.out.print("m - Movimenti");
			System.out.println();
			System.out.print("u - Uscita");
			System.out.println();
			System.out.print("-----------------------------------------");
			//definisco l'input relativa alla scelta
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			
		    do {
		    	System.out.println("Definisci Operazione:");
				scelta = scanner.next().charAt(0);
			    switch(scelta) {
			    			case 'v':
			    					System.out.print("somma da versare:");     
			    					double somma = scanner.nextInt();
			    					c1.SetVersamento(somma);
			    					break;
			    			case 'p':
			    					System.out.print("somma da prelevare:");     
			    					double somma1 = scanner.nextInt();
			    					c1.GetPrelievo(somma1);
			    					break;
			    			case 's':
		    					System.out.print("Lettura Saldo:");     
		    					double conto=c1.GetSaldo();
		    					System.out.println();
		    					System.out.print("Il tuo saldo e' pari:"+conto);
		    					break;
			    			case 'm':
			    				System.out.print("Stampa Movimento");     
			    				System.out.println();
			    				c1.GetMovimento();
		    					
		    					
		    					break;
		    					
			    			
			    }

		    }while(scelta!='u');

		}
}


