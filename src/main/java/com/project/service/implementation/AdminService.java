package com.project.service.implementation;

import com.project.enums.Color;
import com.project.exceptions.WrongLogsException;
import com.project.models.person.Admin;
import com.project.models.person.User;
import com.project.models.stone.Diamond;
import com.project.models.stone.Emerald;
import com.project.models.stone.Stone;
import com.project.service.Serialization;
import com.project.service.interfaces.IAdmin;
import com.project.service.interfaces.IPrinter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService implements IAdmin {
    @Override
    public void enter(String email, String password) throws WrongLogsException {
        throw new WrongLogsException("Wrong email or password!");
    }

    @Override
    public void say(IPrinter printer, Admin admin) {
        printer.print("Hello, I'm admin " + admin.getName());
    }

    @Override
    public void addStoneToDB(Stone stone) {
//some impl
    }

    @Override
    public void removeStoneFromDB(Stone stone) {
//some impl
    }

    @Override
    public void removeStoneFromList(List<Stone> stones, int id) {
        stones.remove(id);
    }

    @Override
    public double calculateTotalPrice(List<Stone> stones) {
        double totalPrice=0;
        for(Stone stone : stones){
            totalPrice+=stone.getPrice();
        }
        return totalPrice;
    }

    @Override
    public List<Stone> addStoneToList(List<Stone> stones, Stone stone) {
        stones.add(stone);
        return stones;
    }

    @Override
    public List<Stone> getAllStones() {
        List<Stone> stones=new ArrayList<>();
        stones.add(new Diamond("Diamond1",150,Color.WHITE));
        stones.add(new Diamond("Diamond2",250,Color.GREEN));
        stones.add(new Diamond("Diamond3",350,Color.ORANGE));
        stones.add(new Emerald("Eme1",500,Color.GREEN));
        stones.add(new Emerald("Eme2",80,Color.RED));
        return stones;
    }

    @Override
    public Map<Integer, User> getAllUsers() {
        Map<Integer,User> users=new HashMap<>();
        users.put(1,new User("pavel","zanevskij","mail","pass",500));
        users.put(2,new User("ivan","ivanov","imail","ipass",1500));
        users.put(3,new User("petr","petrov","pmail","ppass",2500));
        return users;
    }

    @Override
    public void serializeStones(List<Stone> stones) {
        if(stones==null){
            throw new NullPointerException("Empty List");
        }
        Serialization.serializeStones(stones);
        System.out.println("Stones has");
    }
}
