package service;

import model.Product;

public interface IProductService {
    Product[] findAll();

    void addProduct (Product product);

    void updateProduct (int updateId, String newName, double newPrice);

    void removeProduct (int removeId);

    void searchProduct (String searchName);

    void sortAscendingByPrice ();

    void sortDescendingByPrice ();
}
