package com.project.service.interfaces;

import com.project.exceptions.WrongLogsException;
import com.project.models.person.Admin;
import com.project.models.person.User;
import com.project.models.stone.Stone;

import java.util.List;
import java.util.Map;

public interface IAdmin {
    void enter(String email,String password) throws WrongLogsException;
    void say(IPrinter printer, Admin admin);
    void addStoneToDB(Stone stone);
    void removeStoneFromDB(Stone stone);
    Map<Integer, User> getAllUsers();
    List<Stone> getAllStones();
    void removeStoneFromList(List<Stone> stones, int id);
    List<Stone> addStoneToList(List<Stone> stones, Stone stone);
    double calculateTotalPrice(List<Stone> stones);
}
