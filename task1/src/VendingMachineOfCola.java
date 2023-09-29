import java.util.ArrayList;
import java.util.List;

public class VendingMachineOfCola implements VendingMachine {
    public List<Product> productList = new ArrayList<>();
//    public List<BottleOfCola> bottleList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> newList){
//        Product list = (BottleOfCola) bottleList;
        this.productList = newList;
        System.out.println(newList);
    }

    public void printProduct(){
//        Product listed = (BottleOfCola) bottleList;
        for (int i = 0; i< list.size(); i++){
            System.out.println(productList.get(i));
        }
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void printProduct(String name){
        for (int i = 0; i< list.size(); i++){
            System.out.println(productList.get(i));
        }
    }
}
