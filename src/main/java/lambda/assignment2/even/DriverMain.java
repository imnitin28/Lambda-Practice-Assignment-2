package lambda.assignment2.even;
public class DriverMain {
    public static void main(String[] args) {
        Long longInput = 11L;
        Long nextEvenNumber = ReturnNextEvenNumber.getNextEvenFunction.apply(Long.valueOf(longInput));
        System.out.println("Next Even number => " +nextEvenNumber);
    }
}
