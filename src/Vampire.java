import java.util.Random;

public class Vampire extends Enemy{
    private Random random = new Random();
    public Vampire(int hp) {
        super(hp);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        super.takeDamage(damage);
    }

    @Override
    public void attack(Hero hero) {//лечение при ударе
        if(!super.isAlive()) return;
        System.out.println("Just a bite!");
        int damage = random.nextInt(20, 51);
        hero.getDamage(damage);
        super.setHp(super.getHp()+damage/2);
    }
}
