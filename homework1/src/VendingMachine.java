import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
     Product getProduct(String name, int volume, int temperature);

     public void initProducts(List<HotDrink> newList);

     public void printProducts();
}
