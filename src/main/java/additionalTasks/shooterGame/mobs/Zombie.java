package additionalTasks.shooterGame.mobs;

import additionalTasks.shooterGame.Mob;

public class Zombie extends Mob {

    private final String nameOpponent = "Зомби";

    @Override
    public void attack() {
        System.out.println("Вы видите, как из оврага на вас выползает " + nameOpponent + " и рычит: \"Мозги-и-и-и\"");
    }
}
