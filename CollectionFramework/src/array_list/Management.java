package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Management {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product(1,"Desk", 150000);
        Product product2 = new Product(2,"Table", 65000);
        Product product3 = new Product(3,"Chair", 35000);
        Product product4 = new Product(4,"Lamp", 50000);

        //Display
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        for (Product product: productList) {
            System.out.println(product);
        }

        //Add
        Product product5 = new Product(5, "Bed", 45000);
        productList.add(product5);

        System.out.println("----After Add-----");
        for (Product product: productList) {
            System.out.println(product);
        }

        //Update

        System.out.println("----After Update-----");


        //Search


        //Sort
        System.out.println("----After Sort-----");
        Collections.sort(productList, new SortByPrice());
        for (Product product: productList) {
            System.out.println(product);
        }

        //Remove
        productList.remove(product3);
        System.out.println("----After Remove-----");
        for (Product product: productList) {
            System.out.println(product);
        }
    }
}
