package exercises.technology;

public class Laptop extends Computer{

    private Integer yearMade;
    private boolean devicePluggedIn = false;

    public Laptop(String aManufacturer, Integer aYearMade) {
        super(aManufacturer);
        yearMade = aYearMade;
    }

    /**** Getters and Setters ****/
    public Integer getYearMade() {
        return yearMade;
    }

    public void setYearMade(Integer yearMade) {
        this.yearMade = yearMade;
    }

    public boolean isDevicePluggedIn() {
        return devicePluggedIn;
    }

    public void setDevicePluggedIn(boolean devicePluggedIn) {
        this.devicePluggedIn = devicePluggedIn;
    }

    /**** Methods ***/
    public void plugIn() {
        devicePluggedIn = true;
    }

    public void unplug() {
        devicePluggedIn = false;
    }
}
