package Model.Entity;

public class NotUniqueLoginException extends Exception {
    private String loginData;

    public NotUniqueLoginException(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }

    public String getLoginData() {
        return loginData;
    }
}
