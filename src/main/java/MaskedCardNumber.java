import org.apache.log4j.Logger;

public class MaskedCardNumber {
    static Logger log = Logger.getLogger(MaskedCardNumber.class.getName());
    public static boolean maskedcardnumber(String cardnumber) {
        if (cardnumber.matches("[0-9]+")) {
            if (cardnumber.length() > 16) {
                log.info("Entered card number contains more than 16 digits");
            } else if (cardnumber.length() < 16) {
                log.info("Entered card number contains less than 16 digits");
            } else {
                String str = cardnumber.substring(0, cardnumber.length() - 4);
                log.info("Masked card number: " + (cardnumber.replace(str, "XXXXXXXXXXXX")));
            }
        } else if (cardnumber.equals("")) {
            log.info("Entered card number is empty");
        } else {
            log.info("Invalid string");
        }
        return true;
    }
    public static void main(String[] args) {
        MaskedCardNumber.maskedcardnumber("1234567891234560");
    }
}
