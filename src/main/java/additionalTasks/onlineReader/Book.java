package additionalTasks.onlineReader;

public class Book  extends Author {

    int id;
    String title;
    String genre;
    int pages;
    int releaseYear;
    double price;


    public Book(String name, String surname, int id, String title, String genre, int pages, int releaseYear, double price) {
        super(name, surname);
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.pages = pages;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ваша книга:\n " + getName() + " "+ getSurname() +
                " \"" + title + "\"" + " ( " + genre + " )\n " +
                "Количество страниц: " + pages + "; Год выпуска: " + releaseYear + "; Стоимость: " + price + " руб."; }

}