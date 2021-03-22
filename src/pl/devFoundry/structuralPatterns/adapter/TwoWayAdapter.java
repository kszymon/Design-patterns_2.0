package pl.devFoundry.structuralPatterns.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    UKDevice ukDevice;
    ContinentalDevice device;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice device) {
        this.ukDevice = ukDevice;
        this.device = device;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        device.on();
    }
}
