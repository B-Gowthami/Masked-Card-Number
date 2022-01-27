public class MaskedCardNumber {
    public static boolean maskedcardnumber(String name) {
        if (name.matches("[0-9]*")) {
            if (name.length() > 16) {
                System.out.println("Entered card number contains more than 16 digits");
            } else if (name.length() < 16) {
                System.out.println("Entered card number contains less than 16 digits");
            } else {
                String str = name.substring(0, name.length() - 4);
                System.out.println("Masked card number: " + (name.replace(str, "XXXXXXXXXXXX")));
            }
        } else {
            System.out.println("Invalid string");
        }
        return true;
    }

    public static void main(String[] args) {
        MaskedCardNumber.maskedcardnumber("1234567891234560");
        System.out.println();
    }
}
