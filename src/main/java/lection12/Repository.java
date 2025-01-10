package lection12;

// Создание отдельного репозитория, в котором будет храниться код для менеджера афишы.

public class Repository {

    private Poster[] posters = new Poster[0];

    // Добавление фильма
    public void save(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    // Удаление фильма
    public void remove(int id) {
        Poster[] tmp = new Poster[posters.length - 1];
        int counter = 0;

        for(Poster poster: posters) {
            if (poster.getId() != id) {
                tmp[counter] = poster;
                counter++;
            }
            posters = tmp;
        }
    }

    // Вывод списка фильмов из массива

    public Poster[] getPosters() {
        return posters;
    }
}
