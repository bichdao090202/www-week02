package vn.edu.iuh.fit.repositories;


import jakarta.servlet.http.HttpSession;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeRepository {
    private Connection conn;
    private HttpSession session;

    public EmployeeRepository(HttpSession session) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String c = "jdbc:mysql://localhost:3306/mydb";
        conn = DriverManager.getConnection(c, "root", "sapassword");
        this.session = session;
    }

    public void test() {
        String sql = "select * from role";
        PreparedStatement ps = conn.prepareStatement(sql);
    }
}
