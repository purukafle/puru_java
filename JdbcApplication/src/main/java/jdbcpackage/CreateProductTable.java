package jdbcpackage;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateProductTable {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession","root", "root");
			//prepare the statement
			PreparedStatement st=connection.prepareStatement("create table hello(PID INT(5)");
			//execute the query
			st.execute();
			//close the connection and statement
			st.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
