package SRP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
/*
 * 负责数据库的增删改查操作
 * 
 */
    private DBUtil db=null;
    public UserDAO() {
         
    }
    boolean findUser(String userId,String userPwd)
    {
        db=new DBUtil();
        Connection connection=db.getConnection();
        try
        {
            Statement db=connection.createStatement();
            ResultSet resultSet=db.executeQuery("select * from user where name='"+userId+"' and password='"+userPwd+"'");
             
            resultSet.last();
            if(resultSet.getRow()<1) return false;//未找到
            else return true;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
