package additionalTasks.shooterGame.mobs;

import additionalTasks.shooterGame.Mob;

public class Rabbit extends Mob {

    private final String nameOpponent = "Кролик";

    @Override
    public void attack() {
        System.out.println("Вы видите, как из-за дерева на вас выпрыгивает " + nameOpponent + ", и испугавшись, убегает. ");
    }

}
