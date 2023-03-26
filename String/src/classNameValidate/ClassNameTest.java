package classNameValidate;

public class ClassNameTest {
    public static ClassName className;
    public static final String[] validClassName = new String[] {"C0318G"};
    public static final String[] invalidClassName = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String classname : validClassName) {
            boolean isValid = className.validate(classname);
            System.out.println("Classname is: " + classname + "is valid: " + isValid);
        }
        for (String classname : invalidClassName) {
            boolean isValid = className.validate(classname);
            System.out.println("Classname is: " + classname + "is valid: " + isValid);
        }
    }
}
