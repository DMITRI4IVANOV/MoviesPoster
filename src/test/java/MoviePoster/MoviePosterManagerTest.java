package MoviePoster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoviePosterManagerTest {
    String film1 = "Bloodshot";
    String film2 = "Forward";
    String film3 = "Hotel Belgrade";
    String film4 = "Gentlemen";
    String film5 = "Invisible man";
    String film6 = "Trolls";
    String film7 = "Number one";
    String film8 = "2012";
    String film9 = "Zombi";
    String film10 = "First";

    //    Вывод фильмов в последовательности добавления
    @Test
    void sholdFindAll() {
        MoviePosterManager manager = new MoviePosterManager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        Assertions.assertArrayEquals(expected, actual);
    }

    //   Лимит выше чем список фильмов
    @Test
    void sholdAboveLimitFindAll1() {
        MoviePosterManager manager = new MoviePosterManager(8);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Assertions.assertArrayEquals(expected, actual);
    }

    //   Вывод фильмов в обратной последовательности
    @Test
    void sholdFindLast() {
        MoviePosterManager manager = new MoviePosterManager(7);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        String[] actual = manager.findLast();
        String[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    //    Лимит вывода фильмов последнего добаления меньше чем полный список
    @Test
    void sholdLimitBelowFindLast1() {
        MoviePosterManager manager = new MoviePosterManager(1);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        String[] actual = manager.findLast();
        String[] expected = {film7};
        Assertions.assertArrayEquals(expected, actual);
    }

    //  Лимит вывода послених добавлений больше списка фильмов
    @Test
    void sholdAboveLimitFindLast1() {
        MoviePosterManager manager = new MoviePosterManager(7);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
