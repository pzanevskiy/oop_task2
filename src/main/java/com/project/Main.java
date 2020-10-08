package com.project;

import com.project.models.person.User;
import com.project.models.stone.Stone;
import com.project.service.Serialization;
import com.project.service.implementation.AdminService;
import com.project.service.implementation.Printer;
import com.project.service.implementation.UserService;
import com.project.service.interfaces.IAdmin;
import com.project.service.interfaces.IPrinter;
import com.project.service.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IAdmin iAdmin=new AdminService();
        IPrinter printer=new Printer();
        Map<Integer, User> users= iAdmin.getAllUsers();
        for(Map.Entry<Integer,User> item:users.entrySet()){
            printer.print(item.getKey().toString()+item.getValue().toString());
        }
        User user=users.get(1);

        List<Stone> stones=iAdmin.getAllStones();
        Serialization.serializeStones(stones);
        for(Stone stone : stones){
            printer.print(stone.toString());
        }
        user.setStones(stones);
        IUser iUser=new UserService();
        iUser.removeStoneFromList(user,1);
        iUser.addStoneToList(user,stones.get(0));
        List<Stone> newStones=Serialization.deserializeStones();
        printer.print("After deserialization");
        for(Stone stone : newStones){
            printer.print(stone.toString());
        }
    }
}
