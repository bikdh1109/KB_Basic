package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest {
    @Test
    @DisplayName("DB연결 테스트 결과")
    public void testConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc_ex";
        String user = "scoula";
        String password = "1234";
        con = DriverManager.getConnection(url, user, password);

        Assertions.assertNull(con);
    }

    @Test
    public void testConnection2() throws ClassNotFoundException {
        Connection conn = JDBCUtil.getConnection();

        Assertions.assertNotNull(conn);
        JDBCUtil.close();

    }
}
