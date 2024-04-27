package org.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private String ownerName;
    private List<LibraryResource> libraryResources;

    public Library(String name, String address, String ownerName) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
        this.libraryResources = new ArrayList<LibraryResource>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addItem(LibraryResource libraryResource) {
        try{
            this.libraryResources.add(libraryResource);
            System.out.println("Item Added Successfully.");
        } catch (Exception ex){
            System.err.println("Error : "+ ex.getMessage());
        }
    }

    public void updateItem(LibraryResource oldLibraryResource, LibraryResource newLibraryResource) {
        if(this.libraryResources.contains(oldLibraryResource)){
            this.libraryResources.set(this.libraryResources.indexOf(oldLibraryResource), newLibraryResource);
            System.out.println("Item Updated Successfully");
        } else {
            System.out.println("Item Not Found.");
        }
}

public void deleteItem(LibraryResource libraryResource) {
    if(this.libraryResources.contains(libraryResource)) {
        this.libraryResources.remove(libraryResource);
        System.out.println("Item Deleted Successfully");
    } else{
        System.out.println("Item Not found.");
    }
}

public void displayAllItems() {
    System.out.println("Library items : ");
    for (LibraryResource libResource : this.libraryResources) {
        libResource.displayInformaiton();
        System.out.println();
    }
}
}
