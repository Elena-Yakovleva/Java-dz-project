package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class BigGun extends Weapon {

    private final String nameWeapon = "Пистолет";

    @Override
    public void shot() {
        System.out.println("Вы стреляете  из  " + nameWeapon + "а: \"Бах - Бах\" и идете дальше.");
    }
}
