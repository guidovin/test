package br.com.fes.relatorios.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.fes.relatorios.itext.*;
public class ConexaoBanco {

    private ResultSet rs = null;
    private ResultSet res;
	
	public static Connection createConnection() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/fes";
		String user = "root";
		String password = "";
		
		//ATENCAO - Eu tive que colocar o registerDriver por causa de um bug para achar o driver
		//O bug so acontecia na minha maquina pessoal, quando fui testar na maquina do trabalho, o banco se conectou sem isso.
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao = DriverManager.getConnection(url, user, password);
				
		return conexao;
		
	}
	
	public ResultSet select(String sql) throws Exception {
        
		Statement stmt = createConnection().createStatement();
		res = stmt.executeQuery(sql);

		SimpleTable simpleTable = new SimpleTable();
		simpleTable.listagemGeral(res);
		simpleTable.manipulatePdf(res);
		
		System.out.println("Query " + sql);
        return rs;
    }	
}
