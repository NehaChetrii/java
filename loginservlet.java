import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class loginservlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String UN = request.getparameter("username");
       String pw = request.getparameter("password");

        out.println(UN);
        Out.println(pw);
       
	}