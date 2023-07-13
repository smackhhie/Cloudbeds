/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaO;



//import connection.*;
import database.FRONT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Add_empmodel;
import model.dashboard;
import view.Add_emp;

public class DaO extends FRONT {


    public static boolean checkUser(Add_empmodel mod) throws Exception {
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
    
    
}  
//    public boolean update(Add_empmodel mod) {
//        PreparedStatement ps = null;
//        Connection conn = dbConnect();
//
//        String sql = "UPDATE students Set first_name=? , last_name= ? , age = ?, address=?, email=?, phone_number=? WHERE student_id=?";

//        try {
//                  ps.setString(1, mod.getFname());
//            ps.setString(2, mod.getSelect());
//            ps.setString(3, mod.getSal());
//            ps.setString(4, mod.getPhone());
//            ps.setString(5, mod.getCitizen());
//            ps.execute();
//            return true;
//
//        } catch (Exception e) {
//            System.err.println(e);
//        } finally {
//            try {
//                conn.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        
//        return false; // Added a default return statement outside the try-catch block
//    }
//}  
//    public boolean delete(Add_empmodel mod) {
//        PreparedStatement ps = null;
//        Connection conn = dbConnect();
//
//        String sql = "DELETE FROM students WHERE student_id=?";
//
//        try {
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1,mod.getStudent_id());
//            ps.execute();
//            return true;
//
//        } catch (Exception e) {
//            System.err.println(e);
//        } finally {
//            try {
//                conn.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        
//        return false; // Added a default return statement outside the try-catch block
//    }
//    
//    public boolean search(Add_empmodel mod) {
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        Connection conn = dbConnect();
//
//        String sql = "SELECT * FROM students WHERE first_name=?";
//
//        try {
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, mod.getFirst_name());
//            rs = ps.executeQuery();
//            
//            if (rs.next())
//            {
//                mod.setStudent_id(Integer.parseInt(rs.getString("student_id")));
//                mod.setFirst_name(rs.getString("first_name"));
//                mod.setLast_name(rs.getString("last_name"));
//                mod.setAge(Integer.parseInt("age"));
//                mod.setAddress(rs.getString("address"));
//                mod.setEmail(rs.getString("email"));
//                mod.setPhone_number(rs.getString("phone_number"));
//                return true;
//                
//            }
//
//            return false;
//
//        } catch (Exception e) {
//            System.err.println(e);
//        } finally {
//            try {
//                conn.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        
//        return false; // Added a default return statement outside the try-catch block
//    }
//}
//public class DaOaddemp {
//    
//}
