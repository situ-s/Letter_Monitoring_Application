package p1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class op {
            Connection conn=null;
            String sql;
            Statement stmt=null;
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
        
        public DefaultComboBoxModel getList(String a){
        DefaultComboBoxModel model=new DefaultComboBoxModel();
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=(Statement) conn.createStatement();
            sql="select distinct(recv_from) from pp where recv_from like'"+a+"%';";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                model.addElement(rs.getString("recv_from"));
            }
       }
	catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return model;
    }
    public DefaultComboBoxModel getList1(String a){
        DefaultComboBoxModel model=new DefaultComboBoxModel();
         try
      {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=(Statement) conn.createStatement();
            sql="select distinct(table_name) from pp where table_name like'"+a+"%';";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                model.addElement(rs.getString("table_name"));
            }
            
      }
	catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return model;
    }
    public DefaultComboBoxModel getList2(String a){
        DefaultComboBoxModel model=new DefaultComboBoxModel();
         try
      {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=(Statement) conn.createStatement();
            sql="select distinct(recv_from) from other where recv_from like'"+a+"%';";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                model.addElement(rs.getString("recv_from"));
            }
            
      }
	catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return model;
    }
    public DefaultComboBoxModel getList3(String a){
        DefaultComboBoxModel model=new DefaultComboBoxModel();
         try
      {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=(Statement) conn.createStatement();
            sql="select distinct(recv_from) from adm where recv_from like'"+a+"%';";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                model.addElement(rs.getString("recv_from"));
            }
            
      }
	catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return model;
    }
}
