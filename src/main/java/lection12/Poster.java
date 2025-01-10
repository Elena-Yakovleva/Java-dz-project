package lection12;

// Создание класса с параметрами афиши

public class Poster {

    int id;
    String fileName;
    String genre;
    String country;


    public Poster(int id, String fileName, String genre, String country) {
        this.id = id;
        this.fileName = fileName;
        this.genre = genre;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
