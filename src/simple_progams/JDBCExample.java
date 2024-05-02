package simple_progams;
import java.sql.*;
public class JDBCExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	//load &register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection
	String url="jdbc:mySQL://localhost:3306/dreamz_technologies";
	String user="username";
	String pwd="enter your password";
	Connection  connect=DriverManager.getConnection(url, user, pwd);
	//creating statement
	Statement statement=connect.createStatement();
	
	//execute the query
	String sql="SELECT * FROM clientinfo";
	  ResultSet rs=statement.executeQuery(sql);
	//process the result
	  while(rs.next()) {
		  System.out.println(rs.getInt(1)+" " +rs.getString(2));
	  }
	//close the resources
	
	statement.close();
	connect.close();
	rs.close();
	
	
	
	}

}
