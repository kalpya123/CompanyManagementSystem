package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignupDao {

	String sql="insert into login values(?,?)";
	String url="jdbc:mysql://localhost:3306/student";
	String username="root";
	String password="kalpya";
	
	
	
	public boolean check(String uname,String pass)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection(url,username,password);
		    PreparedStatement st=con.prepareStatement(sql);
		    st.setString(1, uname);
		    st.setString(2, pass);
		    int  rs=st.executeUpdate();
		    if(rs>0)
		    {
		    	return true;
		    	
		    }
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
}

}
