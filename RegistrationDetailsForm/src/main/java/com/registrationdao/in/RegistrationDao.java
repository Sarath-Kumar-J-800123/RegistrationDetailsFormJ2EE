package com.registrationdao.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.registrationmodel.in.LoginModel;
import com.registrationmodel.in.RegistrationDetailsModel;

public class RegistrationDao {
	public static String url="jdbc:mysql://localhost:3306/MVCProgramAssignment";
	public static String user="root";
	public static String password="Sarath#*2468";
	public static Connection con=null;
	public static Statement st=null;
	public static PreparedStatement ps=null;
	public static ResultSet rs=null;
	
	public void insertRegistration_Details(RegistrationDetailsModel rdm)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement("insert into Registration_Details(Full_Name, Email_Id, Pass_word, Mobile_Number, Gender, City) values(?,?,?,?,?,?)");
			ps.setString(1, rdm.getRname());
			ps.setString(2, rdm.getRemail());
			ps.setString(3, rdm.getRpassword());
			ps.setLong(4, rdm.getMobile());
			ps.setString(5, rdm.getGender());
			ps.setString(6, rdm.getCity());
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String checkLogin(LoginModel lm)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			rs = st.executeQuery("select * from Login");
			
			while(rs.next())
			{
				String demail = rs.getString("Login_Email_Id");
				String dpassword = rs.getString("Login_Password");
				
				if(demail.equals(lm.getEmail_Id()) && dpassword.equals(lm.getPassword()))
				{
					return "Success";
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Failure";
	}
}
