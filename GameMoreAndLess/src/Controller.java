import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
        startGame();
    }

    public void startGame (){
        view.printMessage(View.START_GAME);
        while (true) {
            try {
                view.printMessage(View.ENTER_NUMBER);
                int choiceNumber = scanner.nextInt();
                if (choiceNumber < 0 || choiceNumber > 100){
                    view.printMessage(View.WRONG_INPUT);
                    continue;
                }
                model.addPlayerNumber(choiceNumber);
                if (model.isFindNumber(choiceNumber)){
                    view.printMessage(View.WIN);
                    view.printStatistics(model.getPlayerAttempts());
                    break;
                }
                if (model.isNumberBigger(choiceNumber)){
                    view.printMessage(View.NUMBER_IS_BIGGER, choiceNumber);
                    model.setMaxNumber(choiceNumber);
                } else {
                    view.printMessage(View.NUMBER_IS_LESS, choiceNumber);
                    model.setMinNumber(choiceNumber);
                }
            } catch (InputMismatchException exception) {
                view.printMessage(View.WRONG_INPUT);
                continue;
            }
        }
    }


}
