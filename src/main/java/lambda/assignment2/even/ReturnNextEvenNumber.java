package lambda.assignment2.even;
import java.util.function.Function;

public class ReturnNextEvenNumber {
    public static Function<Long,Long> getNextEvenFunction = (n)->n%2==0?n+2:n+1;
}
