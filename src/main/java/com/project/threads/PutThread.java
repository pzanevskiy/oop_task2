package com.project.threads;

import com.project.models.stone.Stone;
import com.project.models.store.Store;
import com.project.service.implementation.AdminService;
import com.project.service.interfaces.IAdmin;

import java.util.ArrayList;
import java.util.List;

public class PutThread implements Runnable {

    Store store;
    IAdmin iAdmin=new AdminService();
    public PutThread(Store store){
        this.store=store;
    }
    List<Stone> stoneList=iAdmin.getAllStones();
    @Override
    public void run() {
        for (Stone stone : stoneList) {
            store.put(stone);
        }
    }
}
