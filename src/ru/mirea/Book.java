package ru.mirea;

public class Book {
    private String author;
    private String name;
    private int size;
    public Book(String author, String name, int size) {
        this.author = author;
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

}
