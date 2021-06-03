package exercises.technology;

public class Computer {
    private boolean charged = false;
    private boolean deviceOn = false;
    private String manufacturer;

    public Computer (String aManufacturer) { manufacturer = aManufacturer; }

    /**** Getters and Setters ****/
    public boolean isCharged() {
        return charged;
    }

    public void setCharged(boolean charged) {
        this.charged = charged;
    }

    public boolean isDeviceOn() {
        return deviceOn;
    }

    public void setDeviceOn(boolean deviceOn) {
        this.deviceOn = deviceOn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**** Methods ****/
    public void charge() {
        charged = true;
    }

    public void turnOn() {
        deviceOn = true;
    }

    public void turnOff() {
        deviceOn = false;
    }
}
