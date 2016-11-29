package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
	static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
		PreparedStatement statement = connection.prepareStatement("SELECT users");
		ResultSet resultset = statement.executeQuery();
		while (resultset.next()) {
		String user = resultset.getString("user");
		System.out.println(user);
		}
		resultset.close();
		statement.close();
		connection.close();
		}
}
