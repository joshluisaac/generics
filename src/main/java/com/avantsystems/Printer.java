package com.avantsystems;

public class Printer implements IMachine {

    @Override
    public void execute() {
        System.out.println("Printer...printing..");
    }

}