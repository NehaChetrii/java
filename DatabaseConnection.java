import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection{ 
 public static void main(String[] args){
   getConnection();
   }
    public static Connection getConnection(){
   Connection cn = null;
   String url = null;
   String driverClass = null; 
   try{ 
   url = "jdbc:mysql://localhost:3306/csit_third";
   driverClass="com.mysql.jdbc.Driver";
   Class.forName(driverClass);
   cn = DriverManager.getConnection(url, "root", "");
   System.out.println("Connected!");
   }
   catch(Exception e){
      //System.out.println("Exception; "+e.getMessage());
	  e.printStackTrace();
	  }
   return cn;
}
   }

  


