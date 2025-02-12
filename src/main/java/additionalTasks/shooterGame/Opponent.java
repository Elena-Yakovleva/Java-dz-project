package additionalTasks.shooterGame;

import additionalTasks.shooterGame.mobs.Golem;
import additionalTasks.shooterGame.mobs.Rabbit;
import additionalTasks.shooterGame.mobs.Zombie;

public class Opponent {

    private Mob[] mobs;

    public Opponent() {
        mobs = new Mob[]{
                new Zombie(),
                new Rabbit(),
                new Golem()
        };
    }

    public int getMobsCount() {
        // length - позволяет узнать, сколько всего противников есть
        return mobs.length;
    }

    public void shotWithOpponents(int slot) {
        // TODO проверить на выход за границы
        if (slot < 0 || slot > mobs.length - 1) {
            System.out.println("Обойдя препятствие, вы видите, что противника за ним нет, и вы решаете просто пострелять.");
        } else {
            // Получаем противника
            Mob mob = mobs[slot];
            // Атака
            mob.attack();
        }
    }

}
