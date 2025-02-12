package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class WaterPistol extends Weapon {

    private final String nameWeapon = "Водный пистолет";

    @Override
    public void shot() {
        System.out.println("Вы стреляете из " + nameWeapon.replace("ный", "ного").replace("ет", "ета") + ": \"Псссс - Псссс\" и идете дальше.");
    }
}
