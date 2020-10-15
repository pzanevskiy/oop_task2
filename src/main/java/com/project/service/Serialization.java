package com.project.service;

import com.project.models.person.User;
import com.project.models.stone.Stone;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Serialization {

public static void serializeStones(List<Stone> stones){
    try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stones.dat"))){
        oos.writeObject(stones);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static ArrayList<Stone> deserializeStones(){
    ArrayList<Stone> stones=new ArrayList<>();
    try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stones.dat"))){
        stones=((ArrayList<Stone>)ois.readObject());
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return stones;
}

public static void serializeUsers(HashMap<Integer, User> users){
    try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("users.dat"))){
        oos.writeObject(users);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static HashMap<Integer, User> deserializeUsers(){
    HashMap<Integer, User> users=new HashMap<>();
    try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("users.dat"))){
        users=((HashMap<Integer, User>)ois.readObject());
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return users;
}
}
