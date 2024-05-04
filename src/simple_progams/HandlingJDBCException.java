package simple_progams;
//Always it is good to handle the Exception not throwing it
import java.sql.*;
public class HandlingJDBCException {

	public static void main(String[] args) {
	//load &register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Establish the connection
	String url="jdbc:mySQL://localhost:3306/dreamz_technologies";
	String user="username";
	String pwd="password";
	Connection connect = null;
	try {
		connect = DriverManager.getConnection(url, user, pwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//creating statement
	Statement statement = null;
	try {
		statement = connect.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//execute the query
	String sql="SELECT * FROM clientinfo";
	  ResultSet rs = null;
	try {
		rs = statement.executeQuery(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//process the result
	  try {
		while(rs.next()) {
			  System.out.println(rs.getInt(1)+" " +rs.getString(2));
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//close the resources
	finally {
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	}

}
