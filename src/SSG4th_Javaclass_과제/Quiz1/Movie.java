package SSG4th_Javaclass_과제.Quiz1;

public class Movie {
  String title;
  String genre;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void play(String title, String genre){
    System.out.printf("%s(%s) 상영중입니다.\n",title,genre);
  }
}
