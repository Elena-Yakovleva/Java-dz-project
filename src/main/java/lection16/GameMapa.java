package lection16;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;

public class GameMapa {


    // Здесь мы создали словарь, в котором элементы будут храниться в формате “строка-класс”. Строка будет выступать ключом, а класс — значением.
    HashMap<String, Player> players = new HashMap<>(); //

    public HashMap<String, Player> getPlayers() {
        return players;
    }

    public Player register(String name, Player player) {
        // метод containsKey() - проверяет наличие какого-то ключа, если подставить containsValue() - то будет проверяться наличие значения.
        if (players.containsKey(name)) {
            return null;
        } else {
            players.put(name, player);  // .put() - добавляет новый объект;  get() - вывод значения;  remove() - удаление элемента;
            return player;
        }
    }

    public Player findByName(String playerName) {
        return players.get(playerName);
    }

    public int round(String playerName1, String playerName2) {

        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException("Игрок с именем " + playerName1 + " не существует.");
        }

        if (player2 == null) {
            throw new NotRegisteredException("Игрок с именем " + playerName2 + " не существует.");
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }

        if (player1.getStrength() < player2.getStrength()) {
            return 2;

        } else return 0;

    }

}





