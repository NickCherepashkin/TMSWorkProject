package com.drozdova.tms.lib6;

public class CarTask3 extends Wheel {
    private ISpin spinWheel;

    public CarTask3(ISpin action) {
        this.spinWheel = action;
    }

    public void ride() {
        spinWheel.spin();
    }
}
