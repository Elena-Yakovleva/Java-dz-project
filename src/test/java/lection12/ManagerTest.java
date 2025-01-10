package lection12;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Poster poster1 = new Poster(1, "Бладшот", "боевик", "США");
    Poster poster2 = new Poster(2, "Вперёд", "мультфильм", "США, Япония");
    Poster poster3 = new Poster(3, "Отель 'Белград'", "комедия", "Россия");
    Poster poster4 = new Poster(4, "Джентельмены", "боевик", "США");
    Poster poster5 = new Poster(5, "Человек невидимка", "ужасы", "США, Канада, Австралия");
    Poster poster6 = new Poster(6, "Тролли0", "мультфильм", "США");

    public void setup() {
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
    }

    // Вывод пустого массива
    @Test
    public void shouldOutputEmpty() {

        Poster[] expected = {};
        Assertions.assertArrayEquals(expected, manager.getRepo().getPosters());
    }

    // Добавление первой афиши
    @Test
    public  void shouldAddedFirstPoster(){

        manager.add(poster1);
        manager.getRepo().getPosters();
        manager.add(poster2);

        Poster[] expected = {poster1, poster2};
        Poster[] actual = manager.getRepo().getPosters();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод афиш в порядке добавления
    @Test
    public void shouldFindAll(){

        setup();
        manager.findAll();

        Poster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод добавленных афиш в обратном порядке с учетом количества афиш по умолчанию
    @Test
    public void shouldFindLast(){

        setup();
        manager.findLast();

        Poster[] expected = {poster6, poster5, poster4, poster3, poster2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Увеличение количества аптек, выведенных в обратном порядке
    @Test
    public void shouldFindLastSize6(){

        setup();
        manager.setDefaultSize(6);
        manager.findLast();

        Poster[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Уменьшение количества аптек выведенных в обратном порядке
    @Test
    public void shouldFindLastSize4(){

        setup();
        manager.setDefaultSize(4);
        manager.findLast();

        Poster[] expected = {poster6, poster5, poster4, poster3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод афиш в обратном порядке в случае если их количество меньше, чем указанно по умолчанию.
    @Test
    public void shouldFindLastMinSize() {

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.findLast();

        Poster[] expected = {poster4, poster3, poster2, poster1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

  
}