
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url =
            "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "your_password";

        String query = "SELECT id, username, email FROM users";

        try (
            Connection con = DriverManager.getConnection(
                url, user, password
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query)
        ) {
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id")
                );
                System.out.println(
                    "Username: " + rs.getString("username")
                );
                System.out.println(
                    "Email: " + rs.getString("email")
                );
                System.out.println("-------------------");
            }
        } catch (SQLException e) {
            System.out.println(
                "Database error: " + e.getMessage()
            );
        }
    }
}
