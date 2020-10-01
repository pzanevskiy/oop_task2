package com.project.service.interfaces;

import com.project.exceptions.WrongLogsException;
import com.project.models.person.Admin;
import com.project.models.stone.Stone;

public interface IAdmin {
    void enter(String email,String password) throws WrongLogsException;
    void say(IPrinter printer, Admin admin);
    void addStoneToDB(Stone stone);
    void removeStoneFromDB(Stone stone);
}
