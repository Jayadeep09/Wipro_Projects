package JDbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;


public class Prepare_stmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String password="j12@KOTA";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection Created");
		String query="insert into students(rollno,name,per,email) values(?,?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(query);
		
		 ArrayList<Integer> rollNos = new ArrayList<>(Arrays.asList(110, 111));
		 ArrayList<String> names = new ArrayList<>(Arrays.asList("Varma", "Giri"));
		 ArrayList<Integer> pers = new ArrayList<>(Arrays.asList(92, 85));
		 ArrayList<String> emails = new ArrayList<>(Arrays.asList("varma@gmail.com", "giri@gmail.com"));
		 int RowsUpdated = 0;
		 for (int i = 0; i < rollNos.size(); i++) {
	            pst.setInt(1, rollNos.get(i));       
	            pst.setString(2, names.get(i));      
	            pst.setInt(3, pers.get(i));          
	            pst.setString(4, emails.get(i));     

	            int rowsc = pst.executeUpdate();
	            RowsUpdated += rowsc;

	            
	        }
	        System.out.println("Total rows updated: " + RowsUpdated);
//		pst.setInt(1, 110);
//		pst.setString(2, "Varma");
//		pst.setInt(3, 92);
//		pst.setString(4, "varma@gmail.com");
//		pst.setInt(1, 111);
//		pst.setString(2, "Giri");
//		pst.setInt(3, 85);
//		pst.setString(4, "giri@gmail.com");
		// rows=pst.executeUpdate();
		//System.out.println(rows+" updated row" );
		
	}

}
