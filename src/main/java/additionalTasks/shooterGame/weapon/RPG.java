package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class RPG extends Weapon {

    private final String nameWeapon = "RPG";

    public RPG() {}

    public String getNameWeapon() {
        return nameWeapon;
    }

    @Override
    public void shot() {
        System.out.println("Вы слышите выстрел из  " + nameWeapon + ": Ба-баххх");
    }
}
