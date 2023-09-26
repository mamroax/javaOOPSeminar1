public class BottleOfCola extends Product{

    //    final String name = "bottleOfCola";
    int volumeSize;

    public int getVolumeSize() {
        return volumeSize;
    }

    public BottleOfCola(String name, int volumeSize, int cost) {
        this.name = "bottleOfCola";
        this.cost = cost;
        this.volumeSize = volumeSize;
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " Vol = " + volumeSize +
                " cost = " + cost +
                '}';
    }
}
