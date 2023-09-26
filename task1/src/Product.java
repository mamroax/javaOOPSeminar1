public abstract class Product {
    protected String name;
    protected int cost;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println("product name is " + name
                + " product cost is " +  cost);
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " cost = " + cost +
                '}';
    }
}
