package library_system;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    static int totalUsers=0;
    public abstract void returnBook();

    static int getTotalUsers(){
        return totalUsers;
    }
    //default constructor
    User(){
        userId = generateUniqueId();

    }
    //parameterized constructor
    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    //copy constructor
    User(User other) {
        userId = generateUniqueId();
        name = other.name;
        contactInfo = other.contactInfo;

    }
    private final String generateUniqueId() {
        totalUsers++;
        return "user-"+totalUsers;
    }
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
