
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Driver;
import java.util.ArrayList;
/*
public class Dbkatmanin {

    final static String servername = "localhost";
    final static String username = "root";
    final static String dbname  = "studentmanage";
    final static Integer portnumber  = 3306;
    final static String password = "";
    
    public static Connection baglan()
    {
        Connection conn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            conn = datasource.getConnection();
        } catch (SQLException ex) {
             Logger.getLogger(" Get Connection -> " + Dbkatmanin.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return conn;
    }
    
}
*/


public class Dbkatmanin{
    
    final static String JDCB_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/studentmanage?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    final static String USER="root";
    final static String PASS="";
    final static String dbname  = "studentmanage";

    public static Connection baglan(){
        try{
            Class.forName(JDCB_DRIVER);
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = conn.createStatement();
            return conn;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }

        }}
 /* public ArrayList<Studentlist> getData(int susername){

   ArrayList<Studentlist> list = new ArrayList<Studentlist>();
   Connection con = baglan();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
   rs = st.executeQuery("SELECT department_name,faculty_name FROM department,faculty WHERE departmentf_ID =department.ID "+ susername);
   
   Studentlist p;
   while(rs.next()){
   p = new Studentlist(
   rs.getString("ID_PRO"),
   rs.getString("PRO_NAME"),
   rs.getInt("QTE_IN_STOCK"),
   rs.getString("PRICE"),
   rs.getInt("ID_CAT")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(Dbkatmanin.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
    
}

*/
/*
public class Dbkatmanin {
    public static Connection conn;
    public static Connection baglan(){ 
    String dburl="jdbc:derby://localhost:1527/SchoolManage";
    String user="root";
    String password="";
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection(dburl, user, password);
            
        }
        catch(Exception e){
            System.out.println("database error!");
        }
        return conn;
    }
    public void studentlist(){
        if(conn == null){
            System.out.println("Connecting...");
            baglan();
        }
     try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student_information");
            System.out.println("name + \t surname \t username  \t password");
            while(rs.next()){
                System.out.println(""+rs.getString(1)+ " \t"+ rs.getString(2)+" \t"+ rs.getString(3)+ " \t"+ rs.getString(4));
            }
        }
        catch(Exception e){
              e.printStackTrace();
        }

}    



}

*/