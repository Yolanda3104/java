package SRP;
import java.sql.*;
public class DBUtil {
/*
 * 负责数据库的连接，该类可以提供多个数据库操作类重用
 * */
     private Connection connection=null;
     private String urlDb;//数据库 
     private String user;//用户名
     private String password;//密码
    public DBUtil() {
         
    }
 Connection getConnection()
 {
     urlDb="D:/db";//java是数据库名字
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
         connection=DriverManager.getConnection(urlDb, user, password);//连接数据库
     }catch (SQLException e) {
         e.printStackTrace();
    }
     return connection;
 }

}
