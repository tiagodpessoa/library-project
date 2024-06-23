package library;

public class User {
    private String name;
    private Book bookRented;

    public User(String name) {
        this.name = name;
        this.bookRented = null;
    }

    public String getName() {
        return name;
    }

    public Book getBookRented() {
        return bookRented;
    }

    public void setBookRented(Book bookRented) {
        this.bookRented = bookRented;
    }

    @Override
    public String toString() {
        return "User name: " + name + "\n" +
                (bookRented!=null ? getName() + " is renting the book " + getBookRented().getName() : getName() + " do not have a rented book");
    }
}
