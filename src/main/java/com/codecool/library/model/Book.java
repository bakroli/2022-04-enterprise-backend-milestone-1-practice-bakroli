package com.codecool.library.model;

public class Book {

    private String title;
    private String writerName;
    private String genre;
    private int numberOwnedByLibrary;
    private int numberBorrowed;

    public Book() {
    }

    public Book(String title, String writerName, String genre, int numberOwnedByLibrary, int numberBorrowed) {
        this.title = title;
        this.writerName = writerName;
        this.genre = genre;
        this.numberOwnedByLibrary = numberOwnedByLibrary;
        this.numberBorrowed = numberBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOwnedByLibrary() {
        return numberOwnedByLibrary;
    }

    public void setNumberOwnedByLibrary(int numberOwnedByLibrary) {
        this.numberOwnedByLibrary = numberOwnedByLibrary;
    }

    public int getNumberBorrowed() {
        return numberBorrowed;
    }

    public void setNumberBorrowed(int numberBorrowed) {
        this.numberBorrowed = numberBorrowed;
    }
}
