import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student name = " + name + ", age = " + age + ", group = " + group + ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof Student) {
            Student student = (Student) o;
            return this.getAge() == student.getAge() &&
                    this.name.equals(student.getName()) &&
                    this.group.equals(student.getGroup());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.name.hashCode();
        hash = 73 * hash + this.age;
        hash = 73 * hash + this.group.hashCode();
        return hash;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }
}
