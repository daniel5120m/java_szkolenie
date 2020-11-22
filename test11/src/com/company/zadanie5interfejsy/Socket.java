package com.company.zadanie5interfejsy;

public class Socket {
    private ElectricDevice pluggedDevice;

    // podłączenie urządzenia do gniazdka
    public void plugIn(ElectricDevice device) {
        pluggedDevice = device;
        device.electricityOn();
    }

    // odłączenie urządzenia z gniazdka
    public void plugOut() {
        pluggedDevice.electricityOff();
        pluggedDevice = null;
    }
}
