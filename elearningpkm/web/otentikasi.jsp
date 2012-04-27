
<%@page import="java.sql.*"%>




<html>
<body>
<% //membuat koneksi
 
	Class.forName("com.mysql.jdbc.Driver"); 
	String conAddress = "jdbc:mysql://localhost:3306/elearning";
	Connection con = DriverManager.getConnection(conAddress,"root",""); 
	Statement stmt = con.createStatement();       
        String userName=request.getParameter("user");
        String passWord=request.getParameter("passwd");
        String SQL = "SELECT * FROM user where username='userName' and password='passWord'";
        String pin="";
        String id="";
        //int i;
        ResultSet rs = stmt.executeQuery(SQL);
        while( rs.next() )
		{
		     pin = rs.getString("username");
		     id  = rs.getString("password");
			 //i++;
		}
        if((userName.equals(""))&& (passWord.equals(""))) {
           request.getRequestDispatcher("/index.jsp");
           
        } else if(userName.equals(pin) && passWord.equals(id)) {
                request.getRequestDispatcher("/home.jsp");
            } else {request.getRequestDispatcher("/index.jsp");
                
        }
            
            
%>

</body>
</html>