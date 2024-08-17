import java.util.Random;

public class ZombieSamurai extends Enemy{
    private Random random = new Random();

    public ZombieSamurai(int hp) {
        super(hp);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {//может отразить атаку
        if(random.nextInt(0, 101) >= 50){
            System.out.println("Deflect!");
            hero.getDamage(damage);
        }
        else super.takeDamage(damage);
    }

    @Override
    public void attack(Hero hero) {
        if(!super.isAlive()) return;
        System.out.println("Judgment cut!");
        hero.getDamage(random.nextInt(10, 100));
    }


}
