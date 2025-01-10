package lection12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerConstructorTest {

    // Ввод данных для тестирования

    Poster poster1 = new Poster(1, "Бладшот", "боевик", "США");
    Poster poster2 = new Poster(2, "Вперёд", "мультфильм", "США, Япония");
    Poster poster3 = new Poster(3, "Отель 'Белград'", "комедия", "Россия");
    Poster poster4 = new Poster(4, "Джентельмены", "боевик", "США");
    Poster poster5 = new Poster(5, "Человек невидимка", "ужасы", "США, Канада, Австралия");
    Poster poster6 = new Poster(6, "Тролли0", "мультфильм", "США");

    // Вывод пустого массива
    @Test
    public void shouldOutputEmpty(){
        ManagerConstructor manager = new ManagerConstructor();

        Poster[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    // Добавление первой афиши
    @Test
    public void shouldAddedFirstPoster() {
        ManagerConstructor manager = new ManagerConstructor();

        manager.addPoster(poster1);

        Poster[] expected = {poster1};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    // Вывод афиш в порядке добавления
    @Test
    public void shouldFindAll(){
        ManagerConstructor manager = new ManagerConstructor();

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);

        Poster[] expected = {poster1,poster2, poster3, poster4, poster5, poster6};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    // Вывод добавленных афиш в обратном порядке с учетом количества афиш по умолчанию
    @Test
    public void shouldFindLast(){
        ManagerConstructor manager = new ManagerConstructor();

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);

        Poster[] expected = {poster6, poster5, poster4, poster3, poster2};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    // Увеличение количества аптек, выведенных в обратном порядке
    @Test
    public void shouldFindLastSize6(){
        ManagerConstructor manager = new ManagerConstructor(6);

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);

        Poster[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    // Уменьшение количества аптек выведенных в обратном порядке
    @Test
    public void shouldFindLastSize4(){
        ManagerConstructor manager = new ManagerConstructor(4);

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);

        Poster[] expected = {poster6, poster5, poster4, poster3};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    // Вывод афиш в обратном порядке в случае если их количество меньше, чем указанно по умолчанию.
    @Test
    public void shouldFindLastMinSize() {
        ManagerConstructor manager = new ManagerConstructor();

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);

        Poster[] expected = {poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }


}