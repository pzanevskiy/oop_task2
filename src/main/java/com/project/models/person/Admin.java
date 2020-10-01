package com.project.models.person;

import com.project.service.interfaces.IPrinter;

public class Admin extends Person {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    @Override
    public String toString() {
        return "Admin{}";
    }

    @Override
    public void about(IPrinter printer) {
        printer.print("This is admin");
    }

}
