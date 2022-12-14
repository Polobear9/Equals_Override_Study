import java.util.Arrays;

public class EqualsTestMain {
    public static void main(String[] args) {
        Equals_Consumer consumer = new Equals_Consumer("Iphone X", "A1505", "151523", 2019);
        Equals_Consumer consumer1 = new Equals_Consumer("Iphone X", "A1505", "151523", 2019);
        Equals_Consumer consumer2 = new Equals_Consumer("Iphone XS", "A1505", "152344", 2020);
        Equals_Consumer consumer3 = new Equals_Consumer();

        //Equals_Consumer equals is considered to model_Name.. if moder_Name is same with the other model --> return true;
        // consumer and consumer1 is model_Name is same "Iphone x" so return true;
        // consumer and consumer2 is not same the model_Name. so return false.
        System.out.println(consumer.equals(consumer1));
        System.out.println(consumer.equals(consumer2));
        System.out.println(consumer3.getModel_Name());
        System.out.println(consumer.equals(consumer3));
    }
}
