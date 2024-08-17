import java.util.Random;

public class SkeletonBreakdancer extends Enemy{
    private Random random = new Random();
    public SkeletonBreakdancer(int hp) {
        super(hp);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {//может уклонится
        if(random.nextInt(0, 101) > 33) super.takeDamage(damage);
        else System.out.println("Nope!");
    }

    @Override
    public void attack(Hero hero) {//серия ударов
        if(!super.isAlive()) return;
        int count = 0;
        System.out.println("Lets dance!");
        while (random.nextInt(0,101) >= 50 && count < 5){
            hero.getDamage(random.nextInt(25, 100));
            ++count;
        }
    }
}
