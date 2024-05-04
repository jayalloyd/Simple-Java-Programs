package simple_progams;
import java.sql.*;
public class CrudExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	//load &register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection
	String url="jdbc:mySQL://localhost:3306/dreamz_technologies";
	String user="username";
	String pwd="enter you password";
	Connection  connect=DriverManager.getConnection(url, user, pwd);
	//creating statement
	Statement statement=connect.createStatement();
	
	//execute the query
		String sql="SELECT * FROM clientinfo";
	  boolean status=statement.execute(sql);
	//process the result
	  if(status) {
	ResultSet rs=	  statement.getResultSet();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+""+rs.getNString(2));
	}rs.close();}
	else {
		//insert,update,delete
		int rowsAffected=statement.getUpdateCount();
		if (rowsAffected==0) {
			System.out.println("operation not succesful");
			}
			else {
			
				System.out.println("Operation succesful");
				
			}
		}
	
	  
	//close the resources
	
	statement.close();
	connect.close();
	
	
	  
	}

}
