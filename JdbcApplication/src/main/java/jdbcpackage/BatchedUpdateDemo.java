package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchedUpdateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			Statement st=con.createStatement();
			st.addBatch("insert into product values(2,'xyz',70'700");
			st.addBatch("update product set pname='abc' where pid=1");
			int[]n=st.executeBatch();
			System.out.println("effected rows: "+n.length);
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
