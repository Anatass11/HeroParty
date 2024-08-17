import java.util.Random;

public class Ghost extends Enemy{
    private Random random = new Random();
    public Ghost(int hp) {
        super(hp);
    }

    @Override
    public void attack(Hero hero) {//воин боится призраков(
        if(!super.isAlive()) return;
        System.out.println("BOOOO!");
        if(hero.getClass().equals(Warrior.class)) hero.getDamage(2*random.nextInt(10,25));
        else hero.getDamage(random.nextInt(10,25));
    }

    public void takeDamage(int damage, Hero hero) {//только магия эффективна
        if(hero.getClass().equals(Mage.class)) super.takeDamage(damage);
        else {
            System.out.println("Weak!");
            super.takeDamage(1);
        }
    }
}
