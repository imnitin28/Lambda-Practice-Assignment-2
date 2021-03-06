package lambda.assignment2.even.unit;
import lambda.assignment2.even.ReturnNextEvenNumber;
import org.junit.Assert;
import org.junit.Test;
public class ReturnNextEvenNumberTest {
    @Test
    public void getNextEvenFunctionTest()
    {
        Long longReceived1 = ReturnNextEvenNumber.getNextEvenFunction.apply(11L);
        Assert.assertEquals(longReceived1,Long.valueOf(12));

        Long longReceived2 = ReturnNextEvenNumber.getNextEvenFunction.apply(10L);
        Assert.assertEquals(longReceived2,Long.valueOf(12));

        Long longReceived3 = ReturnNextEvenNumber.getNextEvenFunction.apply(10000001L);
        Assert.assertEquals(longReceived3,Long.valueOf(10000002));

        Long longReceived4 = ReturnNextEvenNumber.getNextEvenFunction.apply(99999L);
        Assert.assertEquals(longReceived4,Long.valueOf(100000));

        Long longReceived5 = ReturnNextEvenNumber.getNextEvenFunction.apply(2147483645L);
        Assert.assertEquals(longReceived5,Long.valueOf(2147483646));

        Long longReceived6 = ReturnNextEvenNumber.getNextEvenFunction.apply(-2147483648L);
        Assert.assertEquals(longReceived6,Long.valueOf(-2147483646));

        Long longReceived7 = ReturnNextEvenNumber.getNextEvenFunction.apply(0L);
        Assert.assertEquals(longReceived7,Long.valueOf(2));
    }
}
