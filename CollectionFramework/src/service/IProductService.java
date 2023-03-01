package service;

import model.Product;

public interface IProductService {
    Product[] findAll();

    void addProduct (Product product);

    void updateProduct (int id, String newName, double newPrice);

    void removeProduct (int id);

    void searchProduct (String name);

    void sortAscendingByPrice ();

    void sortDescendingByPrice ();
}
