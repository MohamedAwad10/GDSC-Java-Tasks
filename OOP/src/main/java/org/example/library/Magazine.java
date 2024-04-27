package org.example.library;

public class Magazine extends LibraryResource {
    private String language;

    public Magazine(String title, String author, int publicationYear, String language) {
        super(title, author, publicationYear);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void displayInformaiton() {
        System.out.println("Magazine Title : "+this.getTitle());
        System.out.println("Author Name : "+this.getAuthor());
        System.out.println("Publication Year : "+this.getPublicationYear());
        System.out.println("Language : "+this.language);
    }
}
