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
    public void displayInformation() {
        super.displayCommonInformaiton();
        System.out.println("Language : "+this.language);
    }
}
