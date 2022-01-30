import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class students {
	
	public static void main(String[] arg) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String path = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String pass = "1234";
			
			Connection cn = DriverManager.getConnection(path, user, pass);
			
			Statement smt = cn.createStatement();
			
			String name;
			Scanner k = new Scanner(System.in);
			name = k.nextLine();
			
			
			String query = "insert into student values('"+name+"')";
			
			smt.executeUpdate(query);
			
			System.out.println("done");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
}
