package Ex5Generic;
import java.util.ArrayList;
import java.util.List;

class Media {
    String title;
    String author;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

class Book extends Media {
    String isbn;

    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }
}

class Video extends Media {
    String duration;

    public Video(String title, String author, String duration) {
        super(title, author);
        this.duration = duration;
    }
}

class Newspaper extends Media {
    String publicationDate;

    public Newspaper(String title, String author, String publicationDate) {
        super(title, author);
        this.publicationDate = publicationDate;
    }
}

class Library {
    private List<Media> mediaCollection;

    public Library() {
        mediaCollection = new ArrayList<>();
    }

    public void addMedia(Media media) {
        mediaCollection.add(media);
    }

    public void displayAllMedia() {
        for (Media media : mediaCollection) {
            System.out.println(media);
        }
    }
}

// Sử dụng
public class Program {
    public static void main(String[] args) {
        Library library = new Library();
        library.addMedia(new Book("1984", "George Orwell", "123456789"));
        library.addMedia(new Video("Inception", "Christopher Nolan", "2h 28m"));
        library.addMedia(new Newspaper("Daily News", "John Doe", "2023-09-19"));

        library.displayAllMedia();
    }
}
