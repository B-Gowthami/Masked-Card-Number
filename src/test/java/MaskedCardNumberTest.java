
import org.junit.Test;
import static org.junit.Assert.*;
public class MaskedCardNumberTest {
    MaskedCardNumber maskedCardNumber = new MaskedCardNumber();

    @Test
    public void CardNumberTest1() {
        assertNotSame("Not same", "hcs@67$",
                maskedCardNumber.maskedcardnumber("1234567891234560"));
    }

    @Test
    public void CardNumberTest2() {
        assertTrue("negative numbers",maskedCardNumber.maskedcardnumber("-123456789120"));
    }

    @Test
    public void CardNumberTest3() {
        assertTrue( maskedCardNumber.maskedcardnumber("1234567891234560"));
    }

    @Test
    public void CardNumberTest4() {
        assertEquals(true,
                maskedCardNumber.maskedcardnumber("1234567891234560"));
    }

    @Test
    public void CardNumberTest5() {
        assertNotNull(maskedCardNumber.maskedcardnumber("1234567891234560"));
    }


    @Test
    public void CardNumberTest6() {
        assertNotSame("Not same", "XXXXXXXXXXXX5647",
                maskedCardNumber.maskedcardnumber("123456789123456045"));
    }
    @Test
    public void CardNumberTest7() {
        assertSame(true,
                maskedCardNumber.maskedcardnumber("1234567891234560"));
    }
    @Test
    public void CardNumberTest8() {
        assertFalse( !maskedCardNumber.maskedcardnumber("12345678912"));
    }
}