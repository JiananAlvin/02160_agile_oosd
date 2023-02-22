package principles.srp.solution;

public class Book {
  String title;
  String author;

  public Book() {
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void printCurrentPageAsPlain() {
    System.out.println("current page content");
  }

  public void printCurrentPageAsHTML() {
    System.out.println("<html>\n<header><title>" + this.getTitle() + "<body>\n" + "current page content" + "</body>\n" + "</html>");
  }
}