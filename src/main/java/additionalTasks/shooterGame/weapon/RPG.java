package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class RPG extends Weapon {

    private final String nameWeapon = "Гранатомет";

    @Override
    public void shot() {
        System.out.println("Вы стреляете из " + nameWeapon + "а: \"Ба-баххх\" и идете дальше.");
    }
}
