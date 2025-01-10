package lection12;

//Создание менеджера через два конструктора с выводом заданного количества афиш по умолчанию, или по заданному вручную количеству.


public class ManagerConstructor {

    private Poster[] posters = new Poster[0];
    private int size;

    public ManagerConstructor() {
        this.size = 5;
    }

    public ManagerConstructor(int size) {
        this.size = size;
    }

    // Добавление афиши в массив
    public void addPoster(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        this.posters = tmp;
    }

    // Вывод всех добавленных афиш в порядке добавления
    public Poster[] findAll() {
        return posters;
    }

    // Вывод всех добавленных аптек в обратном порядке, с возможностью выбора количества выведенных афиш
    public Poster[] findLast() {
        int resultLength;
        if ( posters.length < size) {
            resultLength = posters.length;
        } else {
            resultLength = size;
        }
        Poster[] reverse= new Poster[resultLength];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = posters[posters.length - 1 - i];
        }
        return reverse;
    }


}
