package library_system;

public  abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(){
            isbn = "";
            title = "";
            author = "";
            isAvailable = false;
    }
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
   Book(Book other){
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
   }
    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        user.returnBook();
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayBookDetails();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
