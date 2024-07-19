package Board.dto;

import java.sql.*;
import lombok.Getter;
import lombok.Setter;

public class ConnectionDTO{
  @Getter
  private Connection connection = null;
  @Getter
  private final String url = "jdbc:mysql://127.0.0.1:3306/board";
  @Setter
  private String id;
  @Setter
  private String password;

  public boolean setConnection(Connection connection) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(url,id,password);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
      return false;
    }
    this.connection = connection;
    return true;
  }
}
