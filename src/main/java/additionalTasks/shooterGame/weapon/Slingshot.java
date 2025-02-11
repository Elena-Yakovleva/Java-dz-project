package additionalTasks.shooterGame.weapon;

import additionalTasks.shooterGame.Weapon;

public class Slingshot extends Weapon {

    private final String nameWeapon = "Slingshot";

    public Slingshot(){}

    public String getNameWeapon() {
        return nameWeapon;
    }


    @Override
    public void shot() {
        System.out.println("Вы слышите выстрел из  " + nameWeapon + ": Чпок - Чпок");
    }
}
