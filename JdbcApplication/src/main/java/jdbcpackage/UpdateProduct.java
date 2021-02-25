package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProduct {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession","root","root");
		Statement st=con.createStatement();
		int n=st.executeUpdate("update product set pname='soap' where pid=1");
		if(n!=0) {
			System.out.println("successfully updated....");
		}else {
			System.out.println("could no be update.....");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
