import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Main {
	
	static String[] matr= {"n46002315","n45002211"};
	static String[] nome= {"Paolo","Raffaele"};
	static String[] cognome= {"Russo","Pica"};
	static int[] eta= {26,26};
	
	public static void main(String[] args) {
		 ArrayList<Studente> studente = new ArrayList<Studente>();
		 try {
			for(int i=0;i<matr.length;i++) {
				 	Studente  st =new Studente(matr[i],nome[i],cognome[i],eta[i]);
			        studente.add(st);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for (Studente s : studente) {
			    
			    System.out.print(s.GetMatricola() +" ");
	            System.out.print(s.GetCognome() +" ");
	            System.out.print(s.GetNome()+" ");
	            System.out.print(s.GetEtà() +" ");
	            System.out.println();
	           
		 }
		 
		 
		

	}

}
