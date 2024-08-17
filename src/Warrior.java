import java.util.Random;

public class Warrior extends Hero{
    private Random random = new Random();
    public Warrior(String name, int hp) {
        super(name, hp);
    }
    public void attackEnemy(Enemy enemy) { //один сильный удар
        if(!this.isAlive()) return;
        int damage = 5 * random.nextInt(1, 5);
        System.out.println(this.getName().toUpperCase() + " attacks Enemy brutally.");
        System.out.println(this.getName().toUpperCase() + " deal " + damage + " damage!");
        enemy.takeDamage(damage, this);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
