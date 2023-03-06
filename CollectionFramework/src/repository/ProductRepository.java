package repository;

import model.Product;

public class ProductRepository implements IProductRepository{
    private static final Product[] productsList;
    private static int size = 0;

    static {
        productsList = new Product[10];
        productsList[0] = new Product(1, "Desk", 20.5);
        productsList[1] = new Product(2, "Table", 21.5);
        productsList[2] = new Product(3, "Chair", 22.5);
        productsList[3] = new Product(4, "Lamp", 23.5);
        size = 4;
    }

    @Override
    public Product[] findAll() {
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            products[i] = productsList[i];
        }
        return products;
    }

    @Override
    public void addProduct (Product product) {
        productsList[size] = product;
        size++;
    }

    @Override
    public void updateProduct(int updateId, String newName, double newPrice) {
        productsList[updateId].getName();
        productsList[updateId].getPrice();
    }

    @Override
    public void removeProduct(int removeId) {

    }

    @Override
    public void searchProduct(String searchName) {

    }

    @Override
    public void sortAscendingByPrice() {

    }

    @Override
    public void sortDescendingByPrice() {

    }


}
