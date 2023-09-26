import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    public List<Product> list = new ArrayList<>();

    public default void initProducts(List<Product> newList) {
        System.out.println(newList);
    }

    public default void printProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
            }
        }
    }
}
