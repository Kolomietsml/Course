package Controller;

import java.util.regex.Pattern;

/**
 * Regular Expression Class
 */

public interface RegexContainer {
    String REGEX_EN_SURNAME = "[A-Z][a-z]{2,20}";
    String REGEX_EN_NICKNAME = "[A-Za-z0-9]{2,20}";
    String REGEX_EMAIL = "[A-Za-z0-9]{3,30}[@][a-z]{3,10}[.][a-z]{2,4}";
    String REGEX_UA_SURNAME = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}$";
    String REGEX_UA_NICKNAME = "^[A-Za-zА-ЩЬЮЯҐІЇЄа-щьюяґіїє0-9][A-Za-zА-ЩЬЮЯҐІЇЄа-щьюяґіїє'0-9]{2,20}$";
}
