package com.project.models.store;

import com.project.models.person.User;
import com.project.models.stone.Stone;
import com.project.service.implementation.AdminService;
import com.project.service.implementation.UserService;
import com.project.service.interfaces.IAdmin;
import com.project.service.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Stone> stones=new ArrayList<>();
    IUser iUser=new UserService();
    IAdmin iAdmin=new AdminService();
    public synchronized void get(User user){
        while(stones.size()<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try{
            for(int i=0;i<stones.size();i++){
                iUser.addStoneToList(user,stones.get(i));
                iAdmin.removeStoneFromList(stones,i);
            }
        }catch (Exception e){
            System.out.println("exception "+e.getMessage());
        }


        System.out.println("User add stone to basket");
        System.out.println("Stones left "+stones.size());
        notify();
    }

    public synchronized void put(Stone stone){
        while(stones.size()>0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        iAdmin.addStoneToList(stones,stone);
        System.out.println("Admin add stone to store "+stone.toString());
        System.out.println("Stones in store "+stones.size());
        notify();
    }
}
