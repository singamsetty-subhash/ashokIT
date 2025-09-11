import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		insert(101, "JOHN", "john@gmail.com", 8247472841L);
		insert(102, "James", "james@gmail.com", 6304779603L);
		insert(103, "Jorden", "jordan@gmail.com", 8179686951L);
		insert(104, "Jakson", "jakson@gmail.com", 8096191151L);
		insert(105, "Jaffer", "jaffer@gmail.com", 1122334455L);
		insert(106, "Jakartha", "jakartha@gmail.com", 1432314323L);

	}

	private static void insert(int id, String name, String email, long phone) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
			System.out.println("connection created");
			Statement stmt = conn.createStatement();
			System.out.println("Statement is creates");
			String query = "INSERT INTO CUSTOMER VALUES("
			         + id + ", '" + name + "', '" +
			           email + "', " + phone + ")";

			stmt.executeUpdate(query);
			System.out.println("record inserted");
			stmt.close();
			conn.close();
			System.out.println("connection closed");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}