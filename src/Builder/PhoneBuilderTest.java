package Builder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBuilderTest {

    PhoneBuilder builder;

    @Before
    public void setUp() throws Exception {
        builder = new PhoneBuilder();
    }

    @Test
    public void addOS() {
        builder.addOS("Android");
        Phone androidPhone = builder.getPhone();
        assertEquals("This is a test", "Android", androidPhone.getOS());
    }

    @Test
    public void addScreenSize() {
    }

    @Test
    public void addColour() {
    }

    @Test
    public void getPhone() {
    }
}