package additionalTasks.shooterGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        Opponent opponent = new Opponent();

        int slot;

        while (true) {

            System.out.format("Вы идете по дороге и видите препятствие. "
                            + "За препятствием скрывается противник.\n "
                            + "Выберите одного из %d противников"
                            + " или введите end, чтобы завершить игру\n",
                    opponent.getMobsCount()
            );

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                System.out.println("Game over!");
                break;
            } else {
                slot = Integer.parseInt(input) - 1;
                opponent.shotWithOpponents(slot);
                System.out.format("У игрока %d слотов с оружием,"
                                + " введите номер, чтобы выстрелить.\n",
                        player.getSlotsCount()
                );
                input = scanner.nextLine();
                slot = Integer.parseInt(input) - 1;
                player.shotWithWeapon(slot);
            }

        }

    }

}
