package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class AutomaticWeapons extends Weapon {

    private final String nameWeapon = "AutomaticWeapons";

    public AutomaticWeapons(){}

    public String getNameWeapon() {
        return nameWeapon;
    }

    @Override
    public void shot() {
        System.out.println("Вы слышите выстрел из  " + nameWeapon + ": Тра-та-та-та-та");
    }
}
