import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BL 
{

	public Connection c;
	public Statement stmt; 

	public BL() 
	{
		try
		{

			c = DriverManager.getConnection("jdbc:sqlite:D:/SQLiteStudio/transportation");

		} 
		catch ( Exception e )
		{


			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}

	}



	public driver getdriver(String id)
	{
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM driver where id="+id);
			int idans = rs.getInt("id");
			int  license = rs.getInt("license type");
			return new driver(idans,license);


		} catch (SQLException e) {
			return null;
		}

	}

	public truck getruck(String id)
	{
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM truck where id="+id);
			int idans = rs.getInt("id");
			String  model = rs.getString("model");
			String  color = rs.getString("color");
			double netw=rs.getDouble("net weight");
			double maxw=rs.getDouble("max weight");

			return new truck(idans,model,color,netw,maxw);


		} catch (SQLException e) {
			return null;
		}
	}

	public station getstation(String add)
	{ 
		try{
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM station where address="+'"'+add+'"');
			String address = rs.getString("address");
			String  p = rs.getString("phone Number");
			String  n = rs.getString("contact Name");
			return new station(address,p,n);

		
	} catch (SQLException e) {
		return null;
	}
				
	}





	public static void main(String args[])
	{
		BL bl = new BL();
		bl.getdriver("305259525");
		bl.getruck("1");
		bl.getstation("yarden 3");

	}


}
