import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
	        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/goodyear","root","123");
	        Statement smt=cn.createStatement();
	       System.out.println("Enter Employee ID U Want to Search:");
	       DataInputStream KB=new DataInputStream(System.in);
	       String eid=KB.readLine();
	       String q="Select * from employees where employeeid="+eid;
	        ResultSet rs=smt.executeQuery(q);
	        if(rs.next())
	        {
	        System.out.println("Employee ID:"+rs.getString(1));
	        System.out.println("Name:"+rs.getString(2));
	        System.out.println("Gender:"+rs.getString(3));
	        System.out.println("DOB:"+rs.getString(4));
	        System.out.println("Salary:"+rs.getString(5));
	          }
	        else
	        {System.out.println("Record Not Found");}
			}catch(Exception e)
			{
			System.out.println(e);	
			}
	}

}
