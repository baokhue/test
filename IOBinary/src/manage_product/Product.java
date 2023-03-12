package manage_product;

public class Product {
    private int id;
    private String name;
    private String manufacture;
    private long price;
    private boolean otherDetails;

    public Product() {
    }

    public Product(int id, String name, String manufacture, long price, boolean otherDetails) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.otherDetails = otherDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(boolean otherDetails) {
        this.otherDetails = otherDetails;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", otherDetails='" + otherDetails + '\'' +
                '}';
    }
}
