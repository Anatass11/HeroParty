import java.util.Random;

public class PossessedTurret extends Enemy{
    private Random random = new Random();

    public PossessedTurret(int hp) {
        super(hp);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        super.takeDamage(damage);
    }

    @Override
    public void attack(Hero hero) {//очередь выстрелов
        if(!super.isAlive()) return;
        for(int i = 0; i < random.nextInt(3, 11); ++i){
            System.out.println("Pew!");
            hero.getDamage(random.nextInt(1, 11));
        }
    }
}
