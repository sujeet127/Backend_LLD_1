package library_system;

public class Librarian extends User{
    private String employeeNumber;
    Librarian(String employeeNumber,String name,String contactInfo){
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard ");
        System.out.println("employee number: "+this.employeeNumber+" name: "+getName());


    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    void addNewBook(Book book){
        System.out.println("Book added");

    }
    void removeBook(Book book){
        System.out.println("Book removed");

    }

    @Override
    public void returnBook() {

        System.out.println("Book returned");
    }
}
