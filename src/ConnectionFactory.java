import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Local connection settings only - not committed (see .gitignore).
 */
public class ConnectionFactory {
	public static final int POSTGRESQL = 0;

	public static Connection getDefaultParameterConnection(int dbms){
		String url = "jdbc:postgresql://localhost:5432/postgres";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "!@Postgres34");
		try {
			return DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
