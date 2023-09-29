import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
     * перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт
     * соответствующий имени, объёму и температуре
     * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
     * воспроизвести логику, заложенную в программе
     * Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
     * */

    public static void main(String[] args) {
        Product drink1 = new HotDrink("Эспрессо", 5, 200, 50);
        Product drink2 = new HotDrink("Американо", 7, 300, 60);
        Product drink3 = new HotDrink("Капучино", 6, 250, 55);

        List<HotDrink> prodList = new ArrayList(List.of(drink1, drink2, drink3));
        VendingMachine authomat = new HotDrinkVendingMachine();

        authomat.initProducts(prodList);
        System.out.println(authomat.getProduct("Эспрессо", 200, 50));
//        authomat.printProducts();
    }
}