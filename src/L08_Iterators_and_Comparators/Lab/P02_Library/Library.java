package L08_Iterators_and_Comparators.Lab.P02_Library;

import java.util.Iterator;

public class Library implements Iterable<Book>{
    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    private class LibIterator implements Iterator<Book>{

        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }

    @Override
    public Iterator<Book> iterator(){
        return new LibIterator();
    }
}
