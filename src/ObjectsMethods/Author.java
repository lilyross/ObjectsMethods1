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

    @Override
    public String toString() {
        return "Автор: " + this.name + this.surname;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


