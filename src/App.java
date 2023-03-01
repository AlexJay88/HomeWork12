

public class App {

    private String bookTitle;
     private String author;


    public   App (String bookTitle,String author) {
        this.bookTitle=bookTitle;
        this.author=author;
    }

  public String getBookTitle(){
        return this.bookTitle;
  }

        public String getAuthor(){
        return this.author;
        }
}