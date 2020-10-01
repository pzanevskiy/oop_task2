package com.project.models.person;

import com.project.models.stone.Stone;
import com.project.service.interfaces.IPrinter;

import java.util.ArrayList;
import java.util.Objects;

public class User extends Person {

    private double cash;
    private ArrayList<Stone> stones=new ArrayList<>();

    public ArrayList<Stone> getStones() {
        return stones;
    }

    public void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public User() {
    }

    public User(String name, String surname, String email, String password, double cash) {
        super(name, surname, email, password);
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Double.compare(user.cash, cash) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cash);
    }

    @Override
    public String toString() {
        return super.toString() + "User{" +
                "cash=" + cash +
                '}';
    }

    @Override
    public void about(IPrinter printer) {
        printer.print("This is user");
    }
}
