package org.example.library;

public class Book extends LibraryResource {
    private int countPages;

    public Book(String title, String author, int publicationYear, int countPages) {
        super(title, author, publicationYear);
        this.countPages = countPages;
    }


    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }


    @Override
    public void displayInformation() {
        super.displayCommonInformaiton();
        System.out.println("Pages Count : "+this.countPages);
    }
}
