import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class SignServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
     throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String aa = request.getParameter("firstname");
        String bb = request.getParameter("lastname");
        String cc = request.getParameter("email");
        String dd = request.getParameter("phone");
        String gg = request.getParameter("newpassword");
        String ee = request.getParameter("birthdate");
        String ff = request.getParameter("gender");
        out.println(aa);
        out.println(bb);
        out.println(cc);
        out.println(dd);
        out.println(gg);
        out.println(ee);
        out.println(ff);

        Connection cn = DatabaseConnection.getConnection();

        try{
            Statement stat=cn.createStatement();

            String sql="insert into user_detail(First_Name,Last_Name,Mobile,Email,Birth_Date,Password,Gender)values('"+aa+"','"+bb+"','"+dd+"','"+cc+"','"+ee+"','"+gg+"','"+ff+"')";

            stat.executeUpdate(sql);
            String msg="Inserted into MyDatabase. ";
            System.out.println(msg);
        }catch(Exception a){
            a.printStackTrace();
        }

        
       }
   }
