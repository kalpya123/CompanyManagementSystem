package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpDao {

	String sql="insert into employee3 values(?,?,?,?)";
	String url="jdbc:mysql://localhost:3306/student";
	String username="root";
	String password="kalpya";
	public boolean check(String name,String email,String phone,String salary)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection(url,username,password);
		    PreparedStatement st=con.prepareStatement(sql);
		    st.setString(1, name);
		    st.setString(2, email);
		    st.setString(3, phone);
		    st.setString(4, salary);

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
