package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class BigGun extends Weapon {

    private final String nameWeapon = "BigGun";

    public BigGun(){}

    public String getNameWeapon() {
        return nameWeapon;
    }

    @Override
    public void shot() {
        System.out.println("Вы слышите выстрел из  " + nameWeapon + ": Бах - Бах");
    }
}
