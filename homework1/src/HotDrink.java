/**
 * Это Горячий напиток
 */
public class HotDrink extends Drink{
    protected int temp;
    HotDrink(String name, int cost, int volume, int temp){
        super(name, cost, volume);
        this.temp = temp;
    }

    HotDrink(String name, int cost, int volume){
        this(name, cost, volume, 50);
    }

    HotDrink(String name, int cost){
        this(name, cost, 200);
    }

    HotDrink(String name){
        this(name, 7);
    }

    HotDrink(){
        this("Кофе");
    }

    public double getTemperature(){
        return this.temp;
    }

    @Override
    public String toString() {
        return String.format("%s temperature: %d", super.toString(), temp);
    }
}
