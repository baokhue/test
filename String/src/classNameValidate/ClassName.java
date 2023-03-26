package classNameValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public Pattern pattern;
    public Matcher matcher;

    public static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
