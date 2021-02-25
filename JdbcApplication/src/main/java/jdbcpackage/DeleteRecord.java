package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/7amsession", "root", "root");
			Statement st=con.createStatement();
			int n=st.executeUpdate("delete from product where pid=1");
			if(n!=0) {
				System.out.println("successful........");
			}else {
				System.out.println("not successful");
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
