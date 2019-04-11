package com.avantsystems;

import com.avantsystems.IMachine;
import com.avantsystems.MobilePhone;

public class MachineManager {

    IMachine machine;

    public Machine(IMachine machine) {
        this.machine = machine;
    }

    void apply() {
        machine.execute();
    }

    public static void main(String[] args) {
        Machine m = new Machine(new MobilePhone());
        m.apply();
    }

}