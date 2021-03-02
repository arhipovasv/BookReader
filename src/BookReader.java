import java.util.ArrayList;

public class BookReader {

    public static void main(String[] args) {
        Reader reader = new Reader();
        ArrayList<Book> books = new ArrayList<>();
        Book myBook1 = new Book("Унесенные ветром");
        Book myBook2 = new Book("Война и мир", "Лев Толстой");
        Book myBook3 = new Book("1984", "Джордж Оруэлл", 541);
        Book myBook4 = new Book("Мастер и Маргарита", "Михаил Булгаков", 842, 5);
        books.add(myBook1);
        books.add(myBook2);
        books.add(myBook3);
        books.add(myBook4);
        Book book = reader.choiceBook(books);
        String nameBook = reader.readBook(book);
        System.out.println("Выбранная книга: " + nameBook);
        int score = reader.scoreBook(book);
        System.out.println("Оценка книги: " + score);
    }
}
