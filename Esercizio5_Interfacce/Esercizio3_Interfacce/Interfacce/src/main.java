//Scrivi un programma che dato un numero intero in ingresso vengano restituiti 
//un oggetto rappresentativo del quadrato del numero dato e un oggetto rappresentativo 
//del cubo del numero assegnato. 
//Implementa l'algoritmo attraverso l'uso di una interfaccia comune, 
//che possa evidenziare il comportamento del polimorfismo.



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo cb= new Cubo();
		Numero nm =new Numero();
		Quadrato qdr =new Quadrato();
		nm.ritorna(10);
		System.out.println();
		qdr.ritorna(10);
		System.out.println();
		cb.ritorna(10);
		

	}

}
