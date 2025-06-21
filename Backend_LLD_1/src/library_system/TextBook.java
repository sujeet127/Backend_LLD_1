package library_system;

public class TextBook  extends Book{
    private String subject;
    private int edition;

    TextBook(){
        super();
    }
    TextBook(String subject, int edition) {
        this.subject = subject;
        this.edition = edition;
    }
    TextBook(String subject, int edition,String isbn,String title,String author) {
        super(isbn,title,author);
        this.subject = subject;
        this.edition = edition;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Textbook Details:");
        System.out.println("Subject: "+subject);
        System.out.println("Edition: "+edition);
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());

    }
}
