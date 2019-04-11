package com.avantsystems;

import com.avantsystems.IMachine;

public class MobilePhone<T> implements IMachine {

    @Override
    public void execute() {
        System.out.println("Phone....calling...");
    }

}
