package phoneNumberValidate;

public class Test {
    public static Example example;
    public static final String[] valid = new String[] {"(84)-(0978489648)"};
    public static final String[] invalid = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        example = new Example();

        for (String phoneNumber : valid) {
            boolean isValid = example.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid: " + isValid);
        }
        for (String phoneNumber : invalid) {
            boolean isValid = example.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid: " + isValid);
        }
    }
}
