import java.sql.*;

public class KonekinProperty {
  // template URL
  // jdbc:{namadriverataunamadb}://{domainatauIP}:{PORT}/{namadatabase}
  // localhost == 127.0.0.1
  static String url = "jdbc:mysql://127.0.0.1:3306/dbproperty";
  static String user = "root";
  static String password = "";

  void connect() {
    try {
      Connection connection = DriverManager.getConnection(url, user, password);
      Statement statement = connection.createStatement();

      String queryString = "SELECT * FROM branch";
      ResultSet resultSet = statement.executeQuery(queryString);

      while (resultSet.next()) {
        System.out.println(resultSet.getString("street"));
      }

    } catch (Exception e) {
      System.err.println("ERROR");
      System.err.println(e);
      System.exit(0);
    }
  }
}
