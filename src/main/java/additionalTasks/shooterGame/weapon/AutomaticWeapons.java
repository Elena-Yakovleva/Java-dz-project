package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class AutomaticWeapons extends Weapon {

    private final String nameWeapon = "Автомат";

    @Override
    public void shot() {
        System.out.println("Вы стреляете из " + nameWeapon + "а: \"Тра-та-та-та-та\" и идете дальше.");
    }
}
