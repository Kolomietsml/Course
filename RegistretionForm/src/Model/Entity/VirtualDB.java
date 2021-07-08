package Model.Entity;

public enum VirtualDB {
    FIRST_CONTACT(new Contact("Ivanov", "Iva123", "ivanov@gmail.com")),
    SECOND_CONTACT(new Contact("Petrov", "Pet123", "petrov@mail.ru")),
    THIRD_CONTACT(new Contact("Kozlov", "Koz123", "kozlov@mail.com"));

    private Contact contact;

    VirtualDB(Contact contact) {
        this.contact = contact;
    }

    public static boolean checkNickname(String nicknameDate) {
        for (VirtualDB v : VirtualDB.values()) {
            if (v.getContact().getNickname().equals(nicknameDate)) {
                return true;
            }
        }
        return false;
    }

    public Contact getContact() {
        return contact;
    }
}
