package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

public class ProductService implements IProductService{
    private IProductRepository repository = new ProductRepository();

    @Override
    public Product[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void updateProduct(int id, String newName, double newPrice) {

    }

    @Override
    public void removeProduct(int id) {

    }

    @Override
    public void searchProduct(String name) {

    }

    @Override
    public void sortAscendingByPrice() {

    }

    @Override
    public void sortDescendingByPrice() {

    }


}
