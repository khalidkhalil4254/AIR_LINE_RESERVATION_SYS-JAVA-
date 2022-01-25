package java_OutDoorTask;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
public class DB {

	Connection con;
	private String database="create database outDoor;";

	
	DB(String user,String pass,String db){
	
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"?useSSL=false", user, pass);
			if(con!=null) {
				System.out.println("connected successfully!");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block	
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", user, pass);
				createDB(database);
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"?useSSL=false", user, pass);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			e1.printStackTrace();
		}
	}
	//Method to add new data into dataBase
	public void sqlAdd(String q0,String q1) {
		try {
			con.prepareStatement(q0).executeUpdate();
			con.prepareStatement(q1).executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:"+e);
		}
	}
	
	public void sqlDelete(String q0,String q1) {
		try {
			con.prepareStatement(q0).executeUpdate();
			con.prepareStatement(q1).executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:"+e);
		}
	}
	
	
	public ResultSet sqlFind(String q0) throws SQLException {
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery(q0);
		return r;
	}
	
	public int indexOf(String x,String[]arr) {
		int i=-1;
		
		for(int l=0;l<arr.length;l++) {
			if(x==arr[l]) {
				i=l;
				break;
			}
			}
		return i;
	}
	
	
	public void fileCreating(String fileName,String Text) throws IOException {
		File f=new File(fileName+".txt");
		FileWriter fw=new FileWriter(f);
		fw.write(Text);
		f.createNewFile();
		fw.close();
	}
	
	public void createDB(String sql) throws SQLException {
		Statement stmt = con.createStatement();
		stmt.execute(sql);
	}
	
	public void createTables(String t1,String t2) throws SQLException {
		Statement stmt1 = con.createStatement();
		Statement stmt2 = con.createStatement();
		stmt1.executeUpdate(t1);
		stmt2.executeUpdate(t2);
	}
	
	
}
