import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
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
        System.out.println("Are U Sure To Remove Above Record Yes/No?");
        String ch=KB.readLine();
         if(ch.equalsIgnoreCase("yes"))
         {
         q="delete from employees where employeeid="+eid;
         smt.executeUpdate(q);
         System.out.println("Record Deleted....");
        	 
         }
          }
        else
        {System.out.println("Record Not Found");}
		
	}catch(Exception e)
		{
		System.out.println(e);	
		}

	}}


