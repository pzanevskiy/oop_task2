package com.project.service.implementation;

import com.project.service.interfaces.IPrinter;

public class Printer implements IPrinter {

    public void print(String text){
        System.out.println(text);
    }
}
