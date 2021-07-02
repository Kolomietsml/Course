import java.util.Scanner;
public class Controller {
    public static final String TEST_SENTENCE = "Hello world!";
    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.scanner = new Scanner(System.in);
        this.model = model;
        this.view = view;
        buildSentence();
    }

    public void buildSentence() {
        model.setSentence("");
        view.printMessage(View.ENTER1);
        model.addToSentence(scanner.next());
        System.out.println(View.ENTER2);
        model.addToSentence(" " + scanner.next());
        check(model.getSentence());
    }

    public void check(String sentence) {
        if (sentence.equals(TEST_SENTENCE)) {
            view.printMessage(View.SENTENCE + " " + model.getSentence());
        } else {
            view.printMessage(View.WRONG_INPUT);
            buildSentence();
        }
    }


}
