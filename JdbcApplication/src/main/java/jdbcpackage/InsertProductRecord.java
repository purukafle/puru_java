package jdbcpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertProductRecord {

	public static void main(String[] args) {
		try {
			//step1: load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2: Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/7amsession","root","root");
			//step3:Prepare Statement
			Statement st=con.createStatement();
			//Step4: Execute the query
			int n=st.executeUpdate("insert into product values(1,'abc',56,560)");
			if (n!=0) {
				System.out.println("one record successfully inserted-----");
				
			}else {
				System.out.println("record not able to inserted -------");
			}
			//close the statement
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
