package lection12;

//Создание отдельного менеджера для работы с бизнес-логикой афишы через один конструктор и сеттер
//для вывода заданного количества афиш по умолчанию, или по заданному вручную количеству.

public class Manager {
    private Repository repo;
    private int defaultSize;

    public void setDefaultSize(int size) {
        this.defaultSize = size;

    }

    public Manager(Repository repo) {
        this.repo = repo;
        this.defaultSize = 5;
    }

    public Repository getRepo() {
        return repo;
    }



    // Добавление фильма
    public void add(Poster poster){
        repo.save(poster);
    }

    // Вывод списка фильмов
    public Poster[] findAll(){
        Poster[] all = repo.getPosters();
        return all;
    }


    // Вывод списка фильмов в обратном порядке
    public Poster[] findLast() {
        int resultLength;
        if (repo.getPosters().length < defaultSize) {
            resultLength = repo.getPosters().length;
        } else {
            resultLength = defaultSize;
        }

        Poster[] reverse = new Poster[resultLength];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = findAll()[findAll().length - 1 - i];
        }
        return reverse;
    }

}
