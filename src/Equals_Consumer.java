public class Equals_Consumer extends EqualsTest {

    public Equals_Consumer(String model_Name, String model_Number, String serial_Number) {
        super(model_Name, model_Number, serial_Number);
    }

    // this class test for equals override class.
    // for consumer equals method
    @Override
    public boolean equals(Object obj) {
        return true;
    }

}
