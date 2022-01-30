import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try{
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/goodyear","root","123");
        Statement smt=cn.createStatement();
        DataInputStream KB=new DataInputStream(System.in);
        System.out.println("Enter Employee Id:");
        String eid=KB.readLine();
        System.out.println("Enter Employee Name:");
        String en=KB.readLine();
        System.out.println("Enter Employee Gender:");
        String eg=KB.readLine();
        System.out.println("Enter Employee DOB:");
        String ed=KB.readLine();
        System.out.println("Enter Employee Salary:");
        String es=KB.readLine();
        String q="insert into employees values("+eid+",'"+en+"','"+eg+"','"+ed+"',"+es+")";
        System.out.println(q);
        smt.executeUpdate(q);
        System.out.println("Record Submitted...");
        cn.close();
        
        
    }catch(Exception e)
    {System.out.println(e);}
	}

}
