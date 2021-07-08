package View;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class displays information in the console
 */
public class View {
    static String BUNDLE_MESSAGE_NAME = "message";
//    static Locale uaLocale = new Locale("ua", "UA");
        static Locale usLocale = new Locale("en", "US");
    public static final ResourceBundle BUNDLE = ResourceBundle.getBundle(BUNDLE_MESSAGE_NAME, usLocale);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String printConcatenation(String... message) {
        StringBuilder concatenation = new StringBuilder();
        for (String st : message) {
            concatenation = concatenation.append(st);
        }
        return new String(concatenation.toString());
    }

    public void printErrorMessage(String message) {
        printMessage(printConcatenation(
                BUNDLE.getString(TextConstant.ERROR),
                "\n",
                BUNDLE.getString(message)));
    }

    public void printInputMessage(String message){
        printMessage(BUNDLE.getString(message));
    }


}
