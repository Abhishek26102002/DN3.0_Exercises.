import java.util.Arrays;

public class LibraryManagementSystem {

    public static Book linearSearch(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String searchTitle) {
        int low = 0;
        int high = books.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = books[mid].getTitle();
            
            if (midTitle.equals(searchTitle)) {
                return books[mid];
            } else if (midTitle.compareTo(searchTitle) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return null;
    }

    public static void main(String[] args) {
        // Create a list of books
        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "Pride and Prejudice", "Jane Austen")
        };
        
        // Sort books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        
        // Search for a book
        String searchTitle = "Pride and Prejudice";
        Book foundBookLinear = linearSearch(books, searchTitle);
        Book foundBookBinary = binarySearch(books, searchTitle);
        
        // Print results
        System.out.println("Linear Search Result: " + foundBookLinear);
        System.out.println("Binary Search Result: " + foundBookBinary);
    }
}
