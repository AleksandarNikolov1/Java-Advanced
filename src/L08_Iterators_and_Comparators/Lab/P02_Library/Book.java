package L08_Iterators_and_Comparators.Lab.P02_Library;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Year: %d, Authors: %s", getTitle(), getYear(), String.join(", ", getAuthors()));
    }
}
