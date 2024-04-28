package org.example.library;

public abstract class LibraryResource {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryResource(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    protected void displayCommonInformaiton(){
        System.out.println("Title : "+this.getTitle());
        System.out.println("Author Name : "+this.getAuthor());
        System.out.println("Publication Year : "+this.getPublicationYear());
    }

    public abstract void displayInformation();

}
