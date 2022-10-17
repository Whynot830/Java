package pr16;

public final class Dish implements Item {

    private String name;
    private String description;
    private double cost;

    Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 100;
    }

    Dish(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dish{" + "cost=" + getCost() + ", name='" + getName() + '\'' + ", description='" + getDescription() + '\'' + '}';
    }
}
