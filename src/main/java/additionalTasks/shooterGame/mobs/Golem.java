package additionalTasks.shooterGame.mobs;

import additionalTasks.shooterGame.Mob;

public class Golem extends Mob {

    private final String nameOpponent = "Голем";

    @Override
    public void attack() {
        System.out.println("Вы видите, как из-за камня вылезает " + nameOpponent + " .");
    }
}
