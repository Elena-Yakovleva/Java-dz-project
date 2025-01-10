package lection12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepositoryTest {
    Repository repo = new Repository();

    Poster poster1 = new Poster(1,  "Бладшот", "боевик", "США" );
    Poster poster2 = new Poster(2, "Вперёд", "мультфильм", "США, Япония");
    Poster poster3 = new Poster(3, "Отель 'Белград'", "комедия", "Россия");
    Poster poster4 = new Poster(4, "Джентельмены", "боевик", "США");
    Poster poster5 = new Poster(5, "Человек невидимка", "ужасы", "США, Канада, Австралия");
    Poster poster6 = new Poster(6, "Тролли0", "мультфильм", "США");

    public void setup() {
        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
    }
    @Test
    public void shouldAddedFirstFilm(){
        repo.save(poster1);

        Poster[] expected = {poster1};
        Assertions.assertArrayEquals(expected, repo.getPosters());
    }

    @Test
    public void shouldAddedSecondFilm(){
        repo.save(poster1);
        repo.getPosters();
        repo.save(poster2);

        Poster[] expected = {poster1, poster2};
        Assertions.assertArrayEquals(expected, repo.getPosters());
    }

    @Test
    public void shouldRemoveFilm(){
        setup();
        repo.remove(poster3.getId());

        Poster[] expected = {poster1, poster2, poster4, poster5, poster6};
        Assertions.assertArrayEquals(expected, repo.getPosters());
    }

}