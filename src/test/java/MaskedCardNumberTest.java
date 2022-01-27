
import org.junit.Test;
import static org.junit.Assert.*;
public class MaskedCardNumberTest {
    MaskedCardNumber maskedCardNumber = new MaskedCardNumber();

    @Test
    public void CardNumberTest1() {
        assertNotSame("Not same", "hcs@67$",
                maskedCardNumber.maskedcardnumber("12345678912345@a"));
    }

    @Test
    public void CardNumberTest2() {
        assertFalse(String.valueOf(false), !maskedCardNumber.maskedcardnumber("123456789123abc0"));
    }

    @Test
    public void CardNumberTest3() {
        assertTrue("XXXXXXXXXXXX4560", maskedCardNumber.maskedcardnumber("1234567891234560"));
    }

    @Test
    public void CardNumberTest4() {
        assertEquals(true, maskedCardNumber.maskedcardnumber("1234567891234560"));
    }

    @Test
    public void CardNumberTest5() {
        assertNotNull(maskedCardNumber.maskedcardnumber("1234567891234560"));
    }
    @Test
    public void CardNumberTest6() {
        assertNotEquals((String) null, "abd@$",
                maskedCardNumber.maskedcardnumber("123456789123$#@0"));
    }
    @Test
    public void CardNumberTest7() {
        assertNotSame("Not same", "XXXXXXXXXXXX5647",
                maskedCardNumber.maskedcardnumber("123456789123456045"));
    }
    @Test
    public void CardNumberTest8() {
        assertSame(true,maskedCardNumber.maskedcardnumber("1234567891234560"));
    }
    @Test
    public void CardNumberTest9() {
        assertFalse(String.valueOf(false), !maskedCardNumber.maskedcardnumber("12345678912"));
    }
}