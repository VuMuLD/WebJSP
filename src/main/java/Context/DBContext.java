package Context;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {

    private static DBContext instance;

    public DBContext() {

    }

    public static DBContext getInstance() {
        if (instance == null) {
            synchronized (DBContext.class) {
                if (instance == null) {
                    instance = new DBContext();
                }
            }
        }
        return instance;
    }


    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/muldshop";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }


    public void closeConnection(Connection con) { // đóng kết nối
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    /**
     * Close PrepareStatement to MSSQL Sever
     *
     * @param ps
     */
    public void closePreparedStatement(PreparedStatement ps) { // đóng biên dịch sql
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }

    /**
     * Close ResultSet to MSSQL Sever
     *
     * @param rs
     */
    public void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }
}
