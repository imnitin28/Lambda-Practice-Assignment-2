package lambda.assignment2.even;

import java.util.function.Function;

@FunctionalInterface
public interface ReturnNextEvenNumberInterface {
    Function<Integer,Integer> function();
}
