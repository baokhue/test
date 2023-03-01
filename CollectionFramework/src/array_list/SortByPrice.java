package array_list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else if (o1.getPrice() > o2.getPrice()){
            return 99;
        } else {
            return -3;
        }
    }
}
