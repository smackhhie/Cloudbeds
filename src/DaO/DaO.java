
package DaO;

//ayush,pradip

//import connection.*;
import database.FRONT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Addempmodel;
import model.Add_roommodel;
import model.Cus_infomodel;
import view.dashboard;
import model.emp_infomodel;
import model.loginmodel;
import model.registermodel;
import view.Cus_info;
import view.emp_info;
import view.login;

public class DaO extends FRONT {


    public static boolean checkUser(Addempmodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                try{
            Statement stmt=conn.createStatement();
            String sql="insert into addemp values('"+mod.getFname()+"','"+mod.getSelectedValue()+"','"+mod.getSelect()+"','"+mod.getSal()+"','"+mod.getPhone()+"','"+mod.getCitizen()+"')";
                    stmt.executeUpdate(sql);
                    System.out.println("Data inserted");
//                    JOptionPane.showMessageDialog(null,"Sucessfully Added");
                                    
                    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false; // Added a default return statement outside the try-catch block
    }
    
    
    
    public static boolean update(emp_infomodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                String selectvalue="";
                if (!mod.getMale().equals("")){
                    selectvalue=mod.getMale();
                }
                 if (!mod.getFemale().equals("")){
                    selectvalue=mod.getFemale();
                }
                  if (!mod.getOther().equals("")){
                    selectvalue=mod.getOther();
                }
                else {
                      JOptionPane.showMessageDialog(null,"Select Gender");
        }
                try{
                    System.out.println(mod.getSelectedValue());
//            Statement stmt=conn.createStatement();
                String sql="UPDATE addemp set fname='"+mod.getFname()+"',gender='"+mod.getSelectedValue()+"',job='"+mod.getSelect()+"',Salary='"+mod.getSal()+"',phone='"+mod.getPhone()+"',citizen='"+mod.getCitizen()+"'where citizen='"+mod.getCitizen()+"'";
 java.sql.PreparedStatement stmt =conn.prepareStatement(sql);
                stmt.executeUpdate(sql);
                System.out.println("Data inserted");
                
                JOptionPane.showMessageDialog(null,"Sucessfully updated");
                
                new emp_info().setVisible(true);
            }
            catch(Exception e){
                e.printStackTrace();
            }           
                    
                    
    
        return false; // Added a default return statement outside the try-catch block
    }
    

 

    public static boolean loguser(loginmodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                try{
            Statement stmt=conn.createStatement();
            String sql="select * from signup where username='"+mod.getUsername()+"'AND pass='"+mod.getPassword()+"'";

                    ResultSet result=stmt.executeQuery(sql);
                    boolean check =result.next();
                    if (check){
                        JOptionPane.showMessageDialog(null,"Sucessfully LogedIn");
                    new dashboard().setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Username or Password didn't match,Please enter valid information");
                    }       

              
                    
                    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false; // Added a default return statement outside the try-catch block
    }

        public static boolean registeruser(registermodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                try{
            Statement stmt=conn.createStatement();
            String sql="insert into signup values('"+mod.getFirstname()+"','"+mod.getLastname()+"','"+mod.getSelect()+"','"+mod.getCitizen()+"','"+mod.getUsername()+"','"+mod.getPassword()+"','"+mod.getConpassword()+"')";

            int rowsAffected = stmt.executeUpdate(sql);
        
        if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null,"Sucessfully Created");
                    new login().setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Failed to create");
                    }       
        }
        catch(Exception e){
//            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Username already exist");
//e.printStackTrace();
        }
              
                    
                    
      
        return false; // Added a default return statement outside the try-catch block
    }

        
                public static boolean cusinfoUser(Cus_infomodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                try{
            Statement stmt=conn.createStatement();
            String sql="insert into cusinfo values('"+mod.getCname()+"','"+mod.getSelectedValue()+"','"+mod.getCitizen()+"','"+mod.getPhone()+"')";                    
            int rowsAffected = stmt.executeUpdate(sql);
        
        if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null,"Sucessfully Created");
                    new dashboard().setVisible(true);
                       Cus_info c1=new Cus_info();
                       c1.show();
                       c1.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Failed to create");
                    }       
        }
        catch(Exception e){
            
        }
              
                    
                    
      
        return false; // Added a default return statement outside the try-catch block
    }
                
public static boolean roomUser(Add_roommodel mod) throws Exception {
                Connection conn = FRONT.dbConnect();
                try{
            Statement stmt=conn.createStatement();
            String sql="insert into rooms values('"+mod.getRnumber()+"','"+mod.getBedtype()+"','"+mod.getAvailable()+"','"+mod.getClean()+"','"+mod.getPackagerate()+"','"+mod.getPrice()+"')";                    
             int rowsAffected = stmt.executeUpdate(sql);       
            if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null,"Sucessfully Created");
                    new dashboard().setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Failed to create");
                    }       
        }
        catch(Exception e){
            
        }
              
                    
                    
      
        return false; // Added a default return statement outside the try-catch block
    }
    private static String equal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

