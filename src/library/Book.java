package library;

public class Book {
    private String name;
    private boolean isRented;
    private User rentedBy;

    public Book(String name) {
        this.name = name;
        this.isRented = false;
        this.rentedBy = null;
    }

    public String getName() {
        return name;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public User getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(User rentedBy) {
        this.rentedBy = rentedBy;
    }

    @Override
    public String toString() {
        return "Book: " + getName() + "\n" +
                (isRented() ? "This book is currently rented" : "This book is available");
    }
}
