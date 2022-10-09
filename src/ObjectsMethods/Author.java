package ObjectsMethods;

import java.util.Objects;
public class Author {

    private final String name;
    private final String surname;

    public Author(String Joanne, String Rowling) {
        this.name = Joanne;
        this.surname = Rowling;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public String toString() {
        return "Автор: " + this.name + this.surname;
    }

    public boolean equals(Objects objects) {
        return super.equals(objects);
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


