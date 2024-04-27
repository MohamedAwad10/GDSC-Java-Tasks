package org.example.library;

public class DVD extends LibraryResource {
    private String duration;

    public DVD(String title, String author, int publicationYear, String duration) {
        super(title, author, publicationYear);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public void displayInformation() {
        super.displayCommonInformaiton();
        System.out.println("Duration : "+this.duration);
    }
}
