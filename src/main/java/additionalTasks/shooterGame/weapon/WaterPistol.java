package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class WaterPistol extends Weapon {

    private final String nameWeapon = "WaterPistol";

    public WaterPistol() {}

    public String getNameWeapon() {
        return nameWeapon;
    }

    @Override
    public void shot() {
        System.out.println("Вы слышите выстрел из  " + nameWeapon + ": Псссс - Псссс");
    }
}
