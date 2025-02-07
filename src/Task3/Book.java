package Task3;

//question-1

import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // adding a book
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("book added");
        } else {
            System.out.println("can not add more");
        }
    }

    // removing a book
    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                System.out.println("book removed");
                return;
            }
        }
        System.out.println("not found");
    }

    // searching a book
    public void searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].displayBookDetails();
                return;
            }
        }
        System.out.println("not found");
    }

    // display all books
    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookDetails();
        }
    }
}

class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5);

        while (true) {
            System.out.println("BookManagement Menu:");
            System.out.println("1. add Book");
            System.out.println("2. remove book");
            System.out.println("3. search book by ID");
            System.out.println("4. display all books");
            System.out.println("5. exit");
            System.out.print("enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is the book available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    Book book = new Book(bookID, title, author, isAvailable);
                    library.addBook(book);
                    break;
                }
                case 2: {
                    System.out.print("Enter Book ID to remove: ");
                    int bookID = scanner.nextInt();
                    library.removeBook(bookID);
                    break;
                }
                case 3: {
                    System.out.print("Enter Book ID to search: ");
                    int bookID = scanner.nextInt();
                    library.searchBook(bookID);
                    break;
                }
                case 4: {
                    library.displayBooks();
                    break;
                }
                case 5: {
                    System.out.println("Exiting the Library System.");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("error");
            }
        }
    }
}
