package additionalTasks.shooterGame;

import additionalTasks.shooterGame.weapon.*;

import java.util.Scanner;

public class Player {

    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {

        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new WaterPistol(),
                new Slingshot(),
                new BigGun(),
                new AutomaticWeapons(),
                new RPG()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        if (slot < 0 || slot > weaponSlots.length - 1) {
            System.out.println("Оружия с таким номером - нет. Вы просто убегаете дальше по дороге. ");

        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0

        int slot;

        while (true) {
            System.out.format("Вы идете по дороге и решаете пострелять. У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " или - 1 чтобы выйти%n",
                    player.getSlotsCount()
            );

            int input = scanner.nextInt();

            if (input == -1) {
                System.out.println("Game over!");
                break;
            } else {
                slot = input - 1;
                player.shotWithWeapon(slot);
            }

        }

    }
}