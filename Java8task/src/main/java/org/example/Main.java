package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product obj = new Product();
        List<Product> products = obj.addDummyData();

        // Exercise 1 — Obtain a list of products belongs to category “Books”
        Stream<Product> filterdData1 = products.stream().filter(p -> p.getCategory().equals("Books"));
        System.out.println("Products belongs to Books category : ");
        filterdData1.forEach(
                product -> System.out.println("id: "+product.getId()+ ", name: " +product.getName()
                        + ", category: " +product.getCategory()+ ", price: " +product.getPrice())
        );
        System.out.println("-----------------------------------------------------------------");

        // Exercise 2 — Obtain a list of products belongs to category “Books” with price > 100
        List<Product> filterdData2 = products.stream().filter(p -> p.getCategory().equals("Books")
                && p.getPrice() > 100).toList();
        System.out.println("Products belongs to Books category with price greater than 100 : ");
        filterdData2.forEach(
                product -> System.out.println("id: "+product.getId()+ ", name: " +product.getName()
                        + ", category: " +product.getCategory()+ ", price: " +product.getPrice())
        );
        System.out.println("-----------------------------------------------------------------");

        // Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> filterdData3 = products.stream().filter(p -> p.getCategory().equals("Toys"))
                .map(product -> {
                    double discountedPrice = product.getPrice() * (1 - 10.0/100);
                    return product.withPrice(discountedPrice);
                }).toList();

        filterdData3.forEach(
                product -> System.out.println("id: "+product.getId()+ ", name: " +product.getName()
                        + ", category: " +product.getCategory()+ ", price: " +product.getPrice())
        );

//        filterdData3.forEach(
//                product -> System.out.println("id: "+product.getId()+ ", name: " +product.getName()
//                        + ", category: " +product.getCategory()+ ", price: " +product.getPrice()*0.9)
//        );
        System.out.println("-----------------------------------------------------------------");

        // Exercise 4 — Get the cheapest products of “Books” category
        List<Product> filterdData4 = products.stream().filter(p -> p.getCategory().equals("Books"))
                .toList();
        System.out.println("the cheapest products of “Books” category : ");
    }
}