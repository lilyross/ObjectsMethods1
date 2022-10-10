package ObjectsMethods;

public class ObjectsMethods {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter" ,joanneRowling,1997);
        Book harryPotter1 = new Book("Harry Potter and Chamber of Secrets" ,joanneRowling,1998);
        System.out.println("Название книги : " + harryPotter.getTitle()
                + " Автор : " + harryPotter.getAuthor().getFullName()
                + " Дата : " + harryPotter.getPublicationOfTheYear());
        System.out.println("Название книги : " + harryPotter1.getTitle()
                + " Автор : " +harryPotter1.getAuthor().getFullName()
                + " Дата : " + harryPotter1.getPublicationOfTheYear());
    }
}

