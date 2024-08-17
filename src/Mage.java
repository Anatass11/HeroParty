import java.util.Random;

public class Mage extends Hero{
    private Random random = new Random();
    public Mage(String name, int hp) {
        super(name, hp);
    }

    public void attackEnemy(Enemy enemy) {//случайное заклинание
        if(!this.isAlive()) return;
        System.out.println(this.getName().toUpperCase() + " attacks wisely.");
        for(int i = 0; i < random.nextInt(1, 3); ++i) {
            int damage = 5 * random.nextInt(1, 5);
            System.out.println(this.getName().toUpperCase() + " deal " + damage + " damage!");
            enemy.takeDamage(damage, this);
        }
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
