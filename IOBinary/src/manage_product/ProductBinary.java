package manage_product;

import java.io.*;

public class ProductBinary {

    public static final String FILE_PATH = "C:\\Users\\Thu Nguyen\\IdeaProjects\\IOBinary\\src\\manage_product\\productlist.dat";

    public static void writeObject(Product product) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.close();
    }

    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product product = (Product) ois.readObject();
        ois.close();
        return product;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product1 = new Product(1, "Lamp", "LG", 500000, false);
        writeObject(product1);
        System.out.println(readObject());
    }
}
