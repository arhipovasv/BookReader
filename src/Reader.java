import java.util.List;
import java.util.Random;

public class Reader {

    public Book choiceBook(List<Book> books) {
        if (books.isEmpty()) return null;
        Random random = new Random();
        int book = random.nextInt(books.size());
        return books.get(book);
    }

    public String readBook(Book book) {
        return book.toString();
    }

    public int scoreBook(Book book) {
        Random random = new Random();
        int countSymbolNameBook = book.getName().length();
        int countSymbolAuthorName = book.getAuthor().length();
        int countSerialNumber = book.getSerialNumber();
        int countPage = book.getNumberOfPage();
        if (countSymbolNameBook == 0) {
            countSymbolNameBook = random.nextInt() * -1;
        }
        if (countSymbolAuthorName == 0) {
            countSymbolAuthorName = random.nextInt() * -1;
        }
        if (countSerialNumber == 0) {
            countSerialNumber = random.nextInt() * -1;
        }
        if (countPage == 0) {
            countPage = random.nextInt() * -1;
        }
        return countSymbolNameBook + countSymbolAuthorName + countSerialNumber + countPage;
    }
}
