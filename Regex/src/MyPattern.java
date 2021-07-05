import java.util.regex.Pattern;

/**
 * Regular Expression Pattern Class
 */

public class MyPattern {
    public static final Pattern SURNAME_PATTERN = Pattern.compile("[A-Z][a-z]{2,}");
    public static final Pattern NICKNAME_PATTERN = Pattern.compile("[A-Za-z0-9]{2,}");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("[A-Za-z0-9]{3,30}[@][a-z]{3,10}[.][a-z]{2,4}");
}
