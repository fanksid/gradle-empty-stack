import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonMobileTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_output_message_when_person_make_a_call() {
        Mobile mobile = new Mobile();
        Person person = new Person("Person Name", mobile);

        person.call("Message");

        Assert.assertEquals("Message : Message\n", systemOut());
    }

    @Test
    public void should_output_cannot_send_message_when_person_make_call_with_iphone() {
        Iphone mobile = new Iphone(5);
        Person person = new Person("Person Name", mobile);

        person.call("Message");

        Assert.assertEquals("<iPhone> Message cannot be sent\n", systemOut());
    }

    @Test
    public void should_output_cannot_send_message_when_person_make_call_with_android() {
        Android mobile = new Android(5);
        Person person = new Person("Person Name", mobile);

        person.call("Message");

        Assert.assertEquals("<Android> Message cannot be sent\n", systemOut());
    }

    @Test
    public void should_output_message_when_iphone_robot_make_call_with_iphone() {
        Iphone iphone = new Iphone();
        IPhoneRobot robot = new IPhoneRobot(iphone);

        robot.call("Message");

        Assert.assertEquals("<iPhone>Message : Message\n", systemOut());
    }
}
