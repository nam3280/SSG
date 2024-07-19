package Board;

import Board.dao.crudDB;
import Board.dto.ConnectionDTO;
import Board.vo.Board;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

public class BoardExample {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    ConnectionDTO connectionDTO = new ConnectionDTO();
    crudDB crudDB = new crudDB();
    Board board = new Board();

    Connection con = connectionDTO.getConnection();

    boolean stopDB = true;
    while(stopDB) {
      System.out.print("id 입력 : ");
      connectionDTO.setId(br.readLine());
      System.out.print("pwd 입력 : ");
      connectionDTO.setPassword(br.readLine());

      boolean stopBoard = true;
      while (stopBoard) {
        if (connectionDTO.setConnection(con)) {
          System.out.println("[게시물 목록]");
          System.out.println("--------------------------------------------------");
          System.out.println("no\t\twriter\t\t\tdate\t\t\t\ttitle");
          System.out.println("--------------------------------------------------");
          crudDB.showDB(connectionDTO.getConnection());
          System.out.println("--------------------------------------------------");
          System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
          System.out.print("메뉴 선택: ");
          int selectMenu = Integer.parseInt(br.readLine());

          switch (selectMenu) {
            case 1: {
              System.out.print("제목 : ");
              board.setBtitle(br.readLine());
              System.out.print("내용 : ");
              board.setBcontent(br.readLine());
              System.out.print("작성자 : ");
              board.setBwriter(br.readLine());

              if (crudDB.create(connectionDTO.getConnection(), board))
                System.out.println("입력 성공");
              else
                System.out.println("입력 실패");
            }break;
            case 2 : {
              System.out.println("[게시물 읽기]");
              System.out.print("bno : ");
              int selectBno = Integer.parseInt(br.readLine());
              System.out.println("##############################################");
              crudDB.read(connectionDTO.getConnection(),selectBno);
              System.out.println("##############################################");
            }break;
            case 3 : {System.out.println(2);}break;
            case 4 : {System.out.println(2);}break;
            case 5: {
              stopBoard = false;
              stopDB = false;
            }break;
            default:
              break;
          }
        } else {
          System.out.println("아이디 또는 비밀번호가 잘못 입력되었습니다.");
          stopBoard = false;
        }
      }
    }
  }
}
