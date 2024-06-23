package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<User> users;
    private List<Book> books;

    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void rentABook(User user, Book book){
        if(!book.isRented()) {
            book.setRented(true);
            book.setRentedBy(user);
            user.setBookRented(book);
        }else{
            System.out.println("The book " + book.getName() + " is already rented");
        }
    }

    public void finishedBook(User user, Book book){
        if(book.isRented() && book.getRentedBy().equals(user)) {
            book.setRented(false);
            book.setRentedBy(null);
            user.setBookRented(null);
        }else{
            System.out.println("The user " + user.getName() + " did not rent book " + book.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Users and their rented books:\n");
        for (User user : users) {
            sb.append("User: ").append(user.getName()).append("\n");
            if (user.getBookRented() == null) {
                sb.append("  No book rented\n");
            } else {
                sb.append("  Rented book: ").append(user.getBookRented().getName()).append("\n");
            }
        }

        sb.append("\nBooks and their renters:\n");
        for (Book book : books) {
            sb.append("Book: ").append(book.getName()).append("\n");
            if (!book.isRented()) {
                sb.append("  Not rented\n");
            } else {
                sb.append("  Rented by: ").append(book.getRentedBy().getName()).append("\n");
            }
        }
        return sb.toString();
    }
}
