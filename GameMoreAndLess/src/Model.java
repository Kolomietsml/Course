import java.util.ArrayList;
import java.util.Random;

public class Model {
    private int lookingNumber;
    private int minNumber;
    private int maxNumber;
    private ArrayList <Integer> playerAttempts;

    public Model() {
        this.playerAttempts = new ArrayList<>();
        minNumber = 0;
        maxNumber = 100;
        Random random = new Random();
        lookingNumber = random.nextInt(100);
    }

    public void addPlayerNumber (int number){
        playerAttempts.add(number);
    }

    public boolean isFindNumber (int number){
        return lookingNumber == number;
    }

    public boolean isNumberBigger (int number){
        return lookingNumber > number;
    }

    public ArrayList<Integer> getPlayerAttempts() {
        return playerAttempts;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
