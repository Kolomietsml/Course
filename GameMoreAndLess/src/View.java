import java.util.ArrayList;

public class View {
    public static final String START_GAME = "Game start. Chose and enter number from 0 to 100";
    public static final String WRONG_INPUT = "Wrong input. Try again";
    public static final String WIN = "You win!!! You find number!";
    public static final String ENTER_NUMBER = "Enter your number:";
    public static final String NUMBER_IS_BIGGER = "Number is bigger than you search";
    public static final String NUMBER_IS_LESS = "Number is less than you search";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message, int number){
        System.out.println(message + " " + number);
    }

    public void printStatistics (ArrayList<Integer>list){
        System.out.println("Game statistics:");
        list.forEach(number -> System.out.println(number + " "));
    }


}
