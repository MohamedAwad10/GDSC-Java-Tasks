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
        try {
            libraryResources.add(libraryResource);
            System.out.println("Item Added Successfully.");
        } catch (Exception ex) {
            System.err.println("Error : " + ex.getMessage());
        }
    }

    public void updateItem(int index, LibraryResource newItem) {
        if (index >= 0 && index < libraryResources.size()) {
            libraryResources.set(index, newItem);
            System.out.println("Item Updated Successfully");
        } else {
            System.out.println("Item Not Found.");
        }
    }

    public void updateItem(LibraryResource oldItem, LibraryResource newItem) {
        if (libraryResources.contains(oldItem)) {
            libraryResources.set(libraryResources.indexOf(oldItem), newItem);
            System.out.println("Item Updated Successfully");
        } else {
            System.out.println("Item Not Found.");
        }
    }

    public void deleteItem(int index) {
        if (index >=0 && index < libraryResources.size()) {
            libraryResources.remove(index);
            System.out.println("Item Deleted Successfully");
        } else {
            System.out.println("Item Not found in specific index.");
        }
    }

    public void deleteItem(LibraryResource item) {
        if (libraryResources.contains(item)) {
            libraryResources.remove(item);
            System.out.println("Item Deleted Successfully");
        } else {
            System.out.println("Item Not found.");
        }
    }

    public void displayAllItems() {
        System.out.println("Library items : ");
        for (LibraryResource item : libraryResources) {
            item.displayInformation();
            System.out.println();
        }
    }

    public void checkAvailability(LibraryResource item) {
        if(this.libraryResources.contains(item)){
            System.out.println("Item is Available.");
        } else {
            System.out.println("Item isn't Available.");
        }
    }
}
