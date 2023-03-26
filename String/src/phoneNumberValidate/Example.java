package phoneNumberValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public Pattern pattern;
    public Matcher matcher;

    public static final String PHONE_NUMBER_REGEX = "^\\([\\d]{2}\\)\\-\\(0[\\d]{9}\\)$";

    public boolean validate(String regex){
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
