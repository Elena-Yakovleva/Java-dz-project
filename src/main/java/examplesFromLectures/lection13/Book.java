package examplesFromLectures.lection13;

public class Book extends Product {

    // Класс является дополнительным и содержит информацию о параметрах характерных для данного класса
    private String author;
    private int pages;
    private int publishedYear;

    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    // При дублировании метода из основного класса в дополнительный доступно изменение параметров
    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void use() {
        System.out.println("Читаем книгу: " + name);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }


}
