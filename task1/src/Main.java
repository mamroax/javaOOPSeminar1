import java.util.ArrayList;
import java.util.List;

public class Main {
    /**Реализуйте класс Товар, содержащий данные о товаре,
    и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
    сохраняющий в себе список исходных продуктов и getProduct(String name)
    */

    /**Сделать класс Товар абстрактным, создать нескольких наследников
     * (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и
     * реализовать класс какого-то одного типа ТорговогоАвтомата (пример:
     * ПродающийБутылкиВодыАвтомат */

    public static void main(String[] args) {
        PieceOfColbasa pieceOfColbasa = new PieceOfColbasa(1, 20, "вареная");
        Product cola = new BottleOfCola("CoolCola", 200, 54);
        Product colbasa = new BottleOfCola("Черноголовка", 200, 55);
        Product smetana = new BottleOfCola("Добрый", 200, 50);
        List<Product> prodList = new ArrayList<>(List.of(cola, colbasa, smetana)); //добавление нескольких объектов
//        prodList.add(cola);
//        prodList.add(colbasa);
//        prodList.add(smetana);

        VendingMachine authomat = new VendingMachineOfCola();
//
        authomat.initProducts(prodList);
        authomat.printProduct("Smetana");
    }
}