package com.project.service.interfaces;

import com.project.exceptions.WrongLogsException;
import com.project.models.person.User;
import com.project.models.stone.Stone;

public interface IUser {
    void enter(String email,String password) throws WrongLogsException;
    void say(IPrinter printer, User user);
    void addStoneToList(User user, Stone stone);
    void removeStoneFromList(User user,int id);

}
