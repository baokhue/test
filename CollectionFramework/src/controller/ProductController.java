package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    Product[] productsList = service.findAll();
                    for (Product product : productsList){
                        System.out.println(product);
                    }
                    break;
                case 2://add
                    System.out.print("Input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Product product = new Product(id, name, price);

                    service.addProduct(product);
                    break;
                case 3://update
                    System.out.print("Input id needed to update: ");
                    int newId = Integer.parseInt(scanner.nextLine());

                    break;
                case 4: //delete

                    break;
                case 5: //search
                    break;
                case 6: //sort
                    break;
                case 7://exit
                    System.exit(0);
            }
        } while (true);
    }
}
