package 다형성.과제3.문제2;

public class Video extends Content{
  private String genre;

  Video(String title, String genre){
    super(title);
    this.genre = genre;
  }

  void totalPrice(){
    if(genre.equals("new"))
      setPrice(2000);
    else if(genre.equals("comic"))
      setPrice(1500);
    else if(genre.equals("child"))
      setPrice(1000);
    else
      setPrice(500);
  }
}
