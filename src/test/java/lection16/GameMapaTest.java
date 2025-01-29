package lection16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GameMapaTest {

    GameMapa game = new GameMapa();

    Player player1 = new Player(1, "Anya", 15);
    Player player2 = new Player(2, "Petya", 11);
    Player player3 = new Player(7, "Oleg", 19);
    Player player4 = new Player(16, "Bond_007", 15);
    Player player5 = new Player(22, "petya", 25);
    Player player6 = new Player(28, "Master", 1);

    // Пустой словарь
    @Test
    public void shouldEmptyHashMapa() {
        Assertions.assertEquals(0, game.players.size());
    }

    //Добавление первого игрока
    @Test
    public void shouldRegisterFirstPlayer() {
        game.register("Anya", player1);

        Assertions.assertEquals(1, game.players.size());
        Assertions.assertTrue(game.getPlayers().containsKey("Anya"));
    }

    // Регистрация двух игроков
    @Test
    public void shouldRegisterTwoPlayer() {
        game.register("Anya", player1);
        game.register("Petya", player2);

        Assertions.assertEquals(2, game.players.size());
        Assertions.assertTrue(game.getPlayers().keySet().containsAll(List.of("Anya", "Petya"))); // Проверяет наличие ключей игроков в словаре
    }

    // Должен выиграть первый игрок
    @Test
    public void shouldWinFirstPlayer() {
        game.register("Petya", player2);
        game.register("Master", player6);

        int actual = game.round("Petya", "Master");
        Assertions.assertEquals(1, actual);

    }

    // Должен выиграть второй игрок
    @Test
    public void shouldWinSecondPlayer() {
        game.register("Oleg", player3);
        game.register("petya", player5);

        int actual = game.round("Oleg", "petya");
        Assertions.assertEquals(2, actual);
    }

    // Оба игрока должны сыграть в ничью
    @Test
    public void shouldBeDraw() {
        game.register("Anya", player1);
        game.register("Bond_007", player4);

        int actual = game.round("Anya", "Bond_007");
        Assertions.assertEquals(0, actual);
    }

    // Должна отсутствовать регистрация у первого игрока
    @Test
    public void shouldNotRegisterFirstPlayer() {
        game.register("Master", player6);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("GM", "Master"));
    }

    // Должна отсутствовать регистрация у второго игрока
    @Test
    public void shouldNotRegisterSecondPlayer() {
        game.register("Bond_007", player4);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Bond_007", "Ivan"));
    }

    // Вывести ключи имена всех игроков
    @Test
    public void shouldGetNamePlayer() {
        game.register("Anya", player1);
        game.register("Petya", player2);
        game.register("Oleg", player3);
        game.register("Bond_007", player4);
        game.register("petya", player5);
        game.register("Master", player6);

        Set nameUser = game.players.keySet();
        System.out.println(nameUser);
    }

    // Отказ в повторной регистрации одного и того же игрока;
    @Test
    public void shouldNotRegisterDuplicateName() {
        game.register("Oleg", player3);
        game.register("Master", player6);
        game.register("Oleg", player3);

        int expected = 2;
        Assertions.assertEquals(2, game.players.size());
    }

    // Должен вывести параметр силы у зарегистрированного игрока
    @Test
    public void shouldGetPlayerStrength() {
        game.register("Anya", player1);
        game.register("Petya", player2);

        int expected = 11;
        int actual = player2.getStrength();
        Assertions.assertEquals(expected, actual);
        //System.out.println("Параметр силы у игрока " + player2.getName() + " равен " + player2.getStrength());
    }

}