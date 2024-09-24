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

class Library<T extends Media> {
    private List<T> mediaCollection;

    public Library() {
        mediaCollection = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaCollection.add(media);
    }

    public void displayAllMedia() {
        for (T media : mediaCollection) {
            System.out.println(media);
        }
    }
}

// Sử dụng
public class ProgramGeneric {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addMedia(new Book("1984", "George Orwell", "123456789"));

        Library<Video> videoLibrary = new Library<>();
        videoLibrary.addMedia(new Video("Inception", "Christopher Nolan", "2h 28m"));

        Library<Newspaper> newspaperLibrary = new Library<>();
        newspaperLibrary.addMedia(new Newspaper("Daily News", "John Doe", "2023-09-19"));

        bookLibrary.displayAllMedia();
        videoLibrary.displayAllMedia();
        newspaperLibrary.displayAllMedia();
    }
}
