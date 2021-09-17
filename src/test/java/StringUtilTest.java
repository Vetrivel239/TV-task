import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void ShouldGetLengthOfTheString()
    {

        new Calculator();
        int  length =  "TestVagrant".length();
        Assert.assertEquals(length,11);
    }
    @Test
    public void ShouldAddTwoNumbers(){
        int sum = new Calculator().getSum(5,2);

        Assert.assertEquals(7,sum);

    }
    @Test
    public void ShouldSubtractTwoNumbers(){
        int result = new Calculator().getResultOfSubtraction(4,2);

        Assert.assertEquals(2,result);
    }
}
