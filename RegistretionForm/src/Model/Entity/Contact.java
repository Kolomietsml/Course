package Model.Entity;

/**
Class with contact descriptions
 */
public class Contact {
    private String surname;
    private String nickname;
    private String email;

    public Contact() {
    }

    public Contact(String surname, String nickname, String email) {
        this.surname = surname;
        this.nickname = nickname;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Model.Entity.Contact{" +
                "surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
