package Board.dao;

import Board.vo.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class crudDB {
  static ResultSet rs = null;
  static PreparedStatement pstmt = null;

  public void showDB(Connection con) {
    try {
      String query = "SELECT * FROM boardField";
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        System.out.println(rs.getInt("bno") + "\t\t\t\t"
            + rs.getString("bwriter") + "\t\t\t"
            + rs.getString("bdate") + "\t\t\t"
            + rs.getString("btitle"));
      }
    } catch (SQLException e) {
      return;
    }
  }

  public boolean create(Connection connection, Board board) {
    String query = "INSERT INTO boardField(btitle,bcontent,bwriter,bdate)"
        + "VALUES(?,?,?,?)";
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);

      pstmt.setString(1, board.getBtitle());
      pstmt.setString(2, board.getBcontent());
      pstmt.setString(3, board.getBwriter());
      Date date = new Date();
      board.setBdate(date);
      pstmt.setString(4, board.getBdate());

      pstmt.executeUpdate();

      pstmt.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    }
    return true;
  }

  public void read(Connection connection, int bno) {
    String query = "SELECT * FROM boardField WHERE bno = " + bno;
    try {
      pstmt = connection.prepareStatement(query);

      rs = pstmt.executeQuery();

      while (rs.next()) {
        System.out.println("번호 : " + rs.getInt("bno"));
        System.out.println("제목 : " + rs.getString("btitle"));
        System.out.println("내용 : " + rs.getString("bcontent"));
        System.out.println("작성자 : " + rs.getString("bwriter"));
        System.out.println("날짜 : " + rs.getString("bdate"));
      }

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  public void clear(Connection connection){

  }
}
