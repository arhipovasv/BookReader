public class Book {
    private String name = "";
    private String author = "";
    private int serialNumber = 0;
    private int numberOfPage = 0;

    public Book(){}

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    public Book(String name, String author, int numberOfPage, int serialNumber) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", serialNumber=" + serialNumber +
                ", numberOfPage=" + numberOfPage +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }
}
