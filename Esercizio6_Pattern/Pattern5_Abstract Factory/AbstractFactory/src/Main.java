/**
Il pattern Abstract Factory consiste in una Factory che crea altre Factory.  
Questo tipo di design pattern rientra nei pattern Creazionali 
poiché fornisce uno dei modi migliori per creare un oggetto.

L’Abstract Factory fornisce un’interfaccia per creare famiglie di oggetti connessi o dipendenti tra loro,
 in modo che non ci sia necessità da parte dei client di specificare 
 i nomi delle classi concrete all’interno del proprio codice.
In questo modo si permette che un sistema sia indipendente dall’implementazione 
degli oggetti concreti e che il client, attraverso l’interfaccia, utilizzi diverse famiglie di prodotti.



 */

/**
 
 
 */
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory1 = FactoryProducer.getFactory(true);
        Figura figura1 = factory1.GetFigura("RETTANGOLO");
        figura1.Disegna();
        figura1.CalcolaArea();
        figura1.GetArea();

	}

}
