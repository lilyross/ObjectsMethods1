package ObjectsMethods;
import java.util.Objects;
public class Book {

        private final String title;
        private final Author author;
        private int publicationOfTheYear;

        public Book(String title, Author author, int publicationOfTheYear) {
            this.title = title;
            this.author = author;
            this.publicationOfTheYear = publicationOfTheYear;
        }

        public String getTitle() {
            return this.title;
        }

        public Author getAuthor() {
            return this.author;
        }

        public int getPublicationOfTheYear() {
            return this.publicationOfTheYear;
        }

        public void setPublicationOfTheYear(int publicationOfTheYear) {
            this.publicationOfTheYear = publicationOfTheYear;
        }
        @Override
    public String toString() {
            return "Book{" + "name ' " + title + '\'' + ", author " + author + "publicationYear " + publicationOfTheYear + "}";
        }
        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Book book = (Book) object;
            return publicationOfTheYear == book.publicationOfTheYear && Objects.equals(title, book) && Objects.equals(author, book.author);
        }
        @Override
        public int hashCode() {
            return Objects.hash(title, author, publicationOfTheYear);
        }
    }

