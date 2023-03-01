package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product(1,"Desk", 150000);
        Product product2 = new Product(2,"Table", 65000);
        Product product3 = new Product(3,"Chair", 35000);
        Product product4 = new Product(4,"Lamp", 50000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        /*//Display
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        for (Product product: productList) {
            System.out.println(product);
        }

        //Add
//        Product product5 = new Product(5, "Bed", 45000);
//        productList.add(product5);
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());

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
    }*/
        int select = 0;
        do {
            System.out.println("-------Product Management------");
            System.out.println("1. List");
            System.out.println("2. Add new product");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Exit");

            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1://list
                    for (Product product: productList) {
                        System.out.println(product);
                    }
                    break;
                case 2://add
                    System.out.print("Input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input price: ");
                    long price = Long.parseLong(scanner.nextLine());
                    Product product6 = new Product(id, name, price);

                    productList.add(product6);
                    for (Product product: productList) {
                        System.out.println(product);
                    }
                    break;
                case 3://update theo id
                    System.out.print("Input id of product needed to update: ");
                    int newId = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < productList.size(); i++) {
                        if (newId == productList.get(i).getId()){
                            System.out.println("Input new product's name: ");
                            String newName = scanner.nextLine();
                            System.out.println("Input new product's price: ");
                            long newPrice = Long.parseLong(scanner.nextLine());

                            productList.get(i).setName(newName);
                            productList.get(i).setPrice(newPrice);

                            System.out.println(productList.get(i));
                        }
                    }
                    break;
                case 4: //delete theo id
                    System.out.println("Input id of product needed to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < productList.size(); i++) {
                        if (deleteId == productList.get(i).getId()){
                            productList.remove(i);
                        }
                    }
                    break;
                case 5: //search theo name
                    System.out.println("Input name of product needed to search: ");
                    String searchingName = scanner.nextLine();

                    for (int i = 0; i < productList.size(); i++) {
                        if (searchingName.equals(productList.get(i).getName())){
                            System.out.println(productList.get(i));
                        }
                    }
                    break;
                case 6: //sort
                    Collections.sort(productList, new SortByPrice());
                    for (Product product: productList) {
                        System.out.println(product);
                    }
                    break;
                case 7://exit
                    System.exit(0);
            }
        } while (true);
    }
}
