package Lesson2.Task66.Assignment2.com.fruitbase.fruits;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import static Lesson2.Task66.Assignment2.com.fruitbase.fruits.Freshness.FRESH;

public abstract class Fruit implements Serializable {
    private String name;
    private double weight;
    private BigDecimal price;
    private Freshness freshness;

    public Fruit(String name, double weight, BigDecimal price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.freshness = FRESH;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Fruit fruit = (Fruit) obj;
        return Objects.equals(name, fruit.name)
                && (weight == fruit.weight) && (Objects.equals(price, fruit.price));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) weight * 1000;
        result = prime * result + price.hashCode();
        result = prime * result + freshness.hashCode();
        return result;
    }

    public boolean isFresh() {
        return freshness == FRESH;
    }

    @Override
    public String toString() {
        return "\nFruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", freshness=" + freshness +
                "}";
    }
}
