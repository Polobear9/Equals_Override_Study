public class EqualsTest {
    private String model_Name; // name of model
    private String model_Number; // number of model
    private String serial_Number; // number of serial

    public EqualsTest(String model_Name, String model_Number, String serial_Number) {
        this.model_Name = model_Name;
        this.model_Number = model_Number;
        this.serial_Number = serial_Number;
    }

    public String getModel_Name() {
        return model_Name;
    }

    public void setModel_Name(String model_Name) {
        this.model_Name = model_Name;
    }

    public String getModel_Number() {
        return model_Number;
    }

    public void setModel_Number(String model_Number) {
        this.model_Number = model_Number;
    }

    public String getSerial_Number() {
        return serial_Number;
    }

    public void setSerial_Number(String serial_Number) {
        this.serial_Number = serial_Number;
    }
}
