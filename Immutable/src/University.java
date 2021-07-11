import java.util.Objects;

/**
 * it is an immutable object
 */

public class University {

    private final String name;
    private final int numberCampuses;
    private final int square;

    public University(String name, int numberCampuses, int square) {
        this.name = name;
        this.numberCampuses = numberCampuses;
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (o instanceof University) {
            University university = (University) o;
            return getNumberCampuses() == university.getNumberCampuses() &&
                    getSquare() == university.getSquare() &&
                    university.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumberCampuses(), getSquare());
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", numberCampuses=" + numberCampuses +
                ", square=" + square +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumberCampuses() {
        return numberCampuses;
    }

    public int getSquare() {
        return square;
    }
}
