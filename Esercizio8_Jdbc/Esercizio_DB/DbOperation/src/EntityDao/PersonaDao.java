package EntityDao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import Entity.Persona;

public class PersonaDao {
		public boolean AggElemento(Persona p, Connection conn) {
					   boolean IsAggiunto=false;
					   try {
						   
						   Statement stmt = (Statement) conn.createStatement();
						   String query = " insert into Persona (CodiceFiscale,nome,cognome)"
						   + " values (?, ?, ?)";
						   // create the mysql insert preparedstatement
				 		   PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
				 		   preparedStmt.setString (1, p.GetCodFiscale());
				 		   preparedStmt.setString (2, p.GetNome());
				 		   preparedStmt.setString   (3,p.GetCognome());
				 		   preparedStmt.execute();
				 		   IsAggiunto=true;
					
	 	               } catch (SQLException e) {
	 			
	 	            	   // TODO Auto-generated catch block
	 	            	   IsAggiunto=false;
	 	            	   e.printStackTrace();
	 	               }
	   
					   return IsAggiunto;
	   }
 
 
		public boolean RimuoviPersona(String CodiceFisc, Connection conn) {
			           boolean IsRimosso=false;
			           String query= "delete from Persona where CodiceFiscale =?";
			           PreparedStatement ps;
					try {
						ps = (PreparedStatement) conn.prepareStatement(query);
						ps.setString(1,CodiceFisc);
				        ps.executeUpdate();
				        IsRimosso=true;
		 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			          
	   return IsRimosso;
	 
 }
		public ArrayList<Persona> ListaPersone(Connection conn) {
			ArrayList<Persona> listaPersone = new ArrayList<>();
			String cf, nome, cognome;
			 String query = "select* FROM persona;";
		        PreparedStatement ps;
				try {
					ps = (PreparedStatement) conn.prepareStatement(query);
					ResultSet rs = (ResultSet) ps.executeQuery();
					 while (rs.next()) {
				            cf=rs.getString("CodiceFiscale");
				            nome=rs.getString("nome");
				            cognome=rs.getString("cognome");
				            Persona persona=new Persona(cf,nome,cognome);
				            listaPersone.add(persona);
				     }
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
			
			
			return listaPersone;
        }
}