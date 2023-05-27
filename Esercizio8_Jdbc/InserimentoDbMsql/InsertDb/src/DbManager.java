import java.sql.*;
public class DbManager {
	
	private Connection conn;
	static final String DB_URL ="jdbc:mysql://localhost:3306/PROVA?characterEncoding=latin1&useConfigs=maxPerformance";
	static final String USER = "root";
	static final String PASS = "paolo";
	//definisco il costruttore
	DbManager(){
		conn=null;
	}
	
	public void GetConnection() {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("Driver Mysql Caricato!");
			System.out.println();
			//instauramento della connessione
			try {
				this.conn=DriverManager.getConnection(DB_URL,USER,PASS);
				System.out.print("Connessione Stabilita con il db!");
				System.out.println();
			} catch (SQLException e) {
				System.out.print("Problemi di connession al db!");
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.print("Problemi nel caricamento del driver!");
			System.out.println();
		}
		
	}
	
	public void InsertData(int id,String Nome, String Cognome) {
			try {
				Statement stmt = conn.createStatement();
				//String sql = "INSERT INTO Persona (id_persona, nome, cognome) VALUES (5,'Francesco','Acconcia');";
				String sql = " insert into Persona (id_persona,Nome,Cognome)"
					    + " values (?, ?, ?)";
				

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(sql);
				      preparedStmt.setInt (1, id);
				      preparedStmt.setString (2, Nome);
				      preparedStmt.setString   (3, Cognome);
				      preparedStmt.execute();

				//stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void CloseConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	

}
