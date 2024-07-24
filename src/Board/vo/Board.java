package Board.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Setter;

public class Board {
  @Setter
  private int bno;
  @Setter
  private String btitle;
  @Setter
  private String bcontent;
  @Setter
  private String bwriter;
  private String bdate;

  public int getBno() {
    return bno;
  }

  public String getBtitle() {
    return btitle;
  }

  public String getBcontent() {
    return bcontent;
  }

  public String getBwriter() {
    return bwriter;
  }

  public String getBdate() {
    return bdate;
  }

  public void setBdateDB(Date bdate) {
    SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/d");

    this.bdate = date.format(bdate);
  }
}
