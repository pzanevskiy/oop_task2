package com.project.service.implementation;

import com.project.exceptions.WrongLogsException;
import com.project.models.person.User;
import com.project.models.stone.Stone;
import com.project.service.interfaces.IPrinter;
import com.project.service.interfaces.IUser;

public class UserService implements IUser {
    @Override
    public void say(IPrinter printer, User user) {
        printer.print("Hello, my name is " + user.getName());
    }

    @Override
    public void addStoneToList(User user, Stone stone) {
        user.getStones().add(stone);
    }

    @Override
    public void enter(String email, String password) throws WrongLogsException {
        throw new WrongLogsException("Wrong email or password");
    }

    @Override
    public void removeStoneFromList(User user, int id) {
        user.getStones().remove(id);
    }

}
