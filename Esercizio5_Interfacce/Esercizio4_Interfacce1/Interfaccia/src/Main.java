//Definisci una interfaccia 'operazione' e le sue classi derivate( sub. div, mul) 
//in modo che da ciascuna sia possibile eseguire la corrispondente operazione aritmetica 
//(di addizione, divisione, moltiplicazione) 
//istanziando un oggetto di classe 'operazione' e due operandi. 
//Realizzare anche, una classe astratta che implementi le funzionalità 
//comuni come la stampa a video del risultato.



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addizione add=new Addizione();
		add.Operazione(10, 20);
		add.StampaRisultato();
		System.out.println();
		Divisione dv = new Divisione();
		dv.Operazione(10, 2);
		dv.StampaRisultato();
		System.out.println();
		Sottrazione str = new Sottrazione();
		str.Operazione(10, 2);
		str.StampaRisultato();
		System.out.println();
		Moltiplicazione prodotto = new Moltiplicazione();
		prodotto.Operazione(10, 2);
		prodotto.StampaRisultato();
		System.out.println();
		//Operazione op =new Addizione();
		VideoRisultato vd= new Addizione();
	
		//vd.StampaRisultato();
		Operazione op=new Addizione();
		op.Operazione(10, 20);
	

	}

}
