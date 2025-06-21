package library_system;

public class Member extends User{
    private int borrowedBooksCount;
    private static int MAX_BORROW_LIMIT=5;
    Member(){
        super();
        borrowedBooksCount = 0;
    }
    Member(String name,String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount = 0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: "+getName());

        System.out.println("Books Borrowed "+borrowedBooksCount);


    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
        System.out.println("Book returned");
    }
}
