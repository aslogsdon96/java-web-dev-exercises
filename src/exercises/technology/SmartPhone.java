package exercises.technology;

public class SmartPhone extends Computer {
    private Integer yearMade;
    private String operatingSystem;

    public SmartPhone(String aManufacturer, Integer aYearMade, String aOperatingSystem) {
        super(aManufacturer);
        yearMade = aYearMade;
        operatingSystem = aOperatingSystem;
    }

    public SmartPhone(String aManufacturer) {
        super(aManufacturer);
    }

    /**** Getters and Setters ****/
    public Integer getYearMade() {
        return yearMade;
    }

    public void setYearMade(Integer yearMade) {
        this.yearMade = yearMade;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**** Methods ****/
    public boolean iMessageCapable() {
        if (operatingSystem == "Apple") {
            return true;
        } else {
            return false;
        }
    }
}
