package com.project.models.stone;

import com.project.enums.Color;

import java.io.Serializable;
import java.util.Objects;

public abstract class Stone implements Serializable {

    private String name;
    private double price;
    private Color color;

    public Stone() {
    }

    public Stone(String name, double price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stone)) return false;
        Stone stone = (Stone) o;
        return Objects.equals(name, stone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Stone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
