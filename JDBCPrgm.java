import java.sql.*;
public class JDBCPrgm
{
	public static void main(String af[])throws Exception
	{
	Connection con;
	Statement stmt;
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","teja");
		stmt=con.createStatement();
		int count=stmt.executeUpdate("insert into customers values(1,'Meher',20,'Chennai',32002)");
		System.out.println(count);
	}
}