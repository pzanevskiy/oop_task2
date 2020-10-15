package com.project.threads;

import com.project.models.person.User;
import com.project.models.stone.Stone;
import com.project.models.store.Store;
import com.project.service.implementation.AdminService;
import com.project.service.interfaces.IAdmin;

public class GetThread implements Runnable {

    Store store;
    public GetThread(Store store){
        this.store=store;
    }
    public User user=new User();
    IAdmin iAdmin=new AdminService();
    @Override
    public void run() {
        for(int i=0;i<iAdmin.getAllStones().size();i++){
            store.get(user);
        }
        for(Stone stone : user.getStones()){
            System.out.println(stone.toString());
        }
    }
}
