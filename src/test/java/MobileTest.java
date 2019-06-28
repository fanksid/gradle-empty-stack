import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MobileTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_get_output_when_mobile_make_a_call() {
        Mobile mobile = new Mobile();

        mobile.call("your input message");

        Assert.assertEquals("Message : your input message\n", systemOut());
    }

    @Test
    public void should_get_output_when_iphone_make_a_call() {
        Iphone iphone = new Iphone();

        iphone.call("your input message");

        Assert.assertEquals("<iPhone>Message : your input message\n", systemOut());
    }

    @Test
    public void should_get_output_when_android_make_a_call() {
        Android android = new Android();

        android.call("your input message");

        Assert.assertEquals("<Android>Message : your input message\n", systemOut());
    }

    @Test
    public void should_output_basic_info_when_get_mobile_info() {
        Mobile mobile = new Mobile("name", "color", "brand");

        mobile.basicInfo();

        Assert.assertEquals("name: name, color: color, brand: brand\n", systemOut());
    }
}
