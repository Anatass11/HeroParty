import java.util.Random;

public class Archer extends Hero{
    private Random random = new Random();
    public Archer(String name, int hp) {
        super(name, hp);
    }


    public void attackEnemy(Enemy enemy) {//попал или не попал
        if(!this.isAlive()) return;
        System.out.println(this.getName().toUpperCase() + " attacks accurately.");
        int hit = random.nextInt(0, 101);
        if(hit <= 33) System.out.println(this.getName().toUpperCase() + " missed!");
        else {
            int damage = 10 * random.nextInt(1, 5);
            System.out.println(this.getName().toUpperCase() + " deal " + damage + " damage!");
            enemy.takeDamage(damage,this);
        }
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
