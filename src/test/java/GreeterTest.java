import org.testng.Assert;
import org.testng.annotations.Test;

public class GreeterTest {

    @Test
    public void testGreetMe() {
        Assert.assertEquals(new Greeter().greetMe("Peter"), "Hello Peter!");
    }
}