package SRP;
import java.sql.*;
public class DBUtil {
/*
 * �������ݿ�����ӣ���������ṩ������ݿ����������
 * */
     private Connection connection=null;
     private String urlDb;//���ݿ� 
     private String user;//�û���
     private String password;//����
    public DBUtil() {
         
    }
 Connection getConnection()
 {
     urlDb="D:/db";//java�����ݿ�����
     user="root";
     password="XXX";
     try
     {
         Class.forName("db");
     }catch (ClassNotFoundException  e) {
         e.printStackTrace();
    } 
     try
     {
         connection=DriverManager.getConnection(urlDb, user, password);//�������ݿ�
     }catch (SQLException e) {
         e.printStackTrace();
    }
     return connection;
 }

}
