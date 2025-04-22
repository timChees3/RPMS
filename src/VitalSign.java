public class VitalSign
{
    // Instance Variables:
    private double heartRate;
    private double temperature;
    private double oxygenLevel;
    private double bloodPressure;

    // Constructor:
    public VitalSign(double heartRate, double temperature, double oxygenLevel, double bloodPressure)
    {
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.oxygenLevel = oxygenLevel;
        this.bloodPressure = bloodPressure;
    }

    // Getter and Setter for heartRate:
    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    // Getter and Setter for temperature:
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Getter and Setter for oxygenLevel:
    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    // Getter and Setter for bloodPressure:
    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    // toString Method:
    @Override
    public String toString() {
        return "VitalSign: \n" +
                "Heart Rate: " + heartRate +
                "\nTemperature: " + temperature +
                "\nOxygen Level: " + oxygenLevel +
                "\nBlood Pressure: " + bloodPressure;
    }
}
