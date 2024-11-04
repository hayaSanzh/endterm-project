import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database() {
        this.connection = connect();
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Connection connect() {
        try {
            String url = "jdbc:sqlite:sample.db";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Database connected.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
