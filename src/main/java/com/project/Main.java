package com.project;

import com.project.models.person.User;
import com.project.models.stone.Stone;
import com.project.models.store.Store;
import com.project.service.Serialization;
import com.project.service.implementation.AdminService;
import com.project.service.implementation.Printer;
import com.project.service.implementation.UserService;
import com.project.service.interfaces.IAdmin;
import com.project.service.interfaces.IPrinter;
import com.project.service.interfaces.IUser;
import com.project.threads.GetThread;
import com.project.threads.PutThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Store store=new Store();
        PutThread putThread=new PutThread(store);
        GetThread getThread=new GetThread(store);
        new Thread(putThread).start();
        new Thread(getThread).start();

//        IAdmin iAdmin=new AdminService();
//        IPrinter printer=new Printer();
//        Map<Integer, User> users= iAdmin.getAllUsers();
//        for(Map.Entry<Integer,User> item:users.entrySet()){
//            printer.print(item.getKey().toString()+item.getValue().toString());
//        }
//        User user=users.get(1);
//
//        List<Stone> stones=iAdmin.getAllStones();
//        Serialization.serializeStones(stones);
//        for(Stone stone : stones){
//            printer.print(stone.toString());
//        }
//        user.setStones(stones);

    }
}
