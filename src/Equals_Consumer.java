import com.sun.org.apache.xpath.internal.operations.Equals;

public class Equals_Consumer extends EqualsTest {

    public Equals_Consumer(String model_Name, String model_Number, String serial_Number) {
        super(model_Name, model_Number, serial_Number);
    }

    // this class test for equals override class.
    // for consumer equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj == null) {
                return false;
            }
            if ((obj instanceof Equals_Consumer)) {
                EqualsTest anotherPhone = (Equals_Consumer) obj;
                this.getModel_Name().equals(anotherPhone.getModel_Name());
                return true;
            } else {
                return false;
            }
        }
    }

}
