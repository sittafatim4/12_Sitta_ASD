import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private String birthDate;

    public Student(String id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return id + "\n" + name + "\n" + birthDate;
    }
}