package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class Slingshot extends Weapon {

    private final String nameWeapon = "Рогатка";

    @Override
    public void shot() {
        System.out.println("Вы стреляете из " + nameWeapon.replace("ка", "ки") + ": \"Чпок - Чпок\" и идете дальше.");
    }
}
