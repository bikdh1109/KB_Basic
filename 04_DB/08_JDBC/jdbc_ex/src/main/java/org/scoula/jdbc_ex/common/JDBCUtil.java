package org.scoula.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static Connection con = null;
    public static Connection getConnection(){
        if(con != null) return con;

        try{
            Properties prop = new Properties();

            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            String url = prop.getProperty("url");
            String driver = prop.getProperty("driver");
            String id = prop.getProperty("id");
            String password = prop.getProperty("password");

            Class.forName(driver);

            con = DriverManager.getConnection(url,id,password);

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    public static void close(){
        try{
        if(con != null){
            con.close();
            con = null;
        }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
