package computer;

public class Battery {
    private String typeOfBattery;

    public Battery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }

    public String getTypeOFBattery() {
        return typeOfBattery;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "typeOfBattery='" + typeOfBattery + '\'' +
                '}';
    }
}
