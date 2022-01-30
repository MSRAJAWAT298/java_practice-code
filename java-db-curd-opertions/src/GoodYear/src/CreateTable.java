import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/goodyear","root","123");
        Statement smt=cn.createStatement();
        String query="create table employees(employeeid numeric(5) primary key,employeename varchar(25),gender varchar(8),dob date,salary numeric(10))";
        smt.executeUpdate(query);
        System.out.println("Table Created....");
        cn.close();
		}catch(Exception e)
		{System.out.println(e);}
 	}

}











