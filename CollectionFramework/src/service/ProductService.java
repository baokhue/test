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
    public void updateProduct(int updateId, String newName, double newPrice) {
        repository.updateProduct(updateId, newName, newPrice);
    }

    @Override
    public void removeProduct(int removeId) {
        repository.removeProduct(removeId);
    }

    @Override
    public void searchProduct(String searchName) {
        repository.searchProduct(searchName);
    }

    @Override
    public void sortAscendingByPrice() {

    }

    @Override
    public void sortDescendingByPrice() {

    }


}
