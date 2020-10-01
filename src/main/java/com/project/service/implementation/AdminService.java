package com.project.service.implementation;

import com.project.exceptions.WrongLogsException;
import com.project.models.person.Admin;
import com.project.models.stone.Stone;
import com.project.service.interfaces.IAdmin;
import com.project.service.interfaces.IPrinter;

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
}
