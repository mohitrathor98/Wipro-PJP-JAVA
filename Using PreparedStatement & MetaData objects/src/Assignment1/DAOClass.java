package Assignment1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DAOClass {
	Connection con;

	DAOClass(){

		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}

	void insert(String[] args)throws SQLException{

		int Rollno = Integer.parseInt(args[1]);
		String StudentName = args[2];
		String Standard = args[3];
		String Date_Of_Birth = args[4];
		int Fees = Integer.parseInt(args[5]);
		PreparedStatement pst = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
		pst.setInt(1, Rollno);
		pst.setString(2, StudentName);
		pst.setString(3, Standard);
		pst.setString(4, Date_Of_Birth);
		pst.setInt(5, Fees);
		pst.executeUpdate();
	}

	void delete(String[] args)throws SQLException{
		int Rollno = Integer.parseInt(args[1]);
		PreparedStatement pst = con.prepareStatement("delete from student where Rollno = ?");
		pst.setInt(1, Rollno);
		pst.executeUpdate();
	}


	void modify(String[] args)throws SQLException{

		int Rollno = Integer.parseInt(args[1]);
		int Fees = Integer.parseInt(args[2]);
		PreparedStatement pst = con.prepareStatement(" Update student set Fees = ? where Rollno = ?");
		pst.setInt(1, Fees);
		pst.setInt(2, Rollno);
		pst.executeUpdate();
	}

	
	void display(String[] args)throws SQLException{
		
		if(args.length == 2){
			int Rollno = Integer.parseInt(args[1]);
			PreparedStatement pst = con.prepareStatement(" Select * from student where Rollno = ?");
			pst.setInt(1, Rollno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4)
					+ " " + rs.getInt(5));
			}
		}
	
		else{
			PreparedStatement pst = con.prepareStatement(" Select * from student");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4)
					+ " " + rs.getInt(5));
			}
		}
	}
}
