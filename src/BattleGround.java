import java.util.ArrayList;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        //Enemy enemy = new Enemy(1000);
        //Hero hero = new Hero("Test");
        //hero.attackEnemy(enemy);
        Random random = new Random();
        ArrayList<Enemy> horde = new ArrayList<>();
        horde.add(new Ghost(200));
        horde.add(new PossessedTurret(100));
        horde.add(new SkeletonBreakdancer(300));
        horde.add(new Vampire(100));
        horde.add(new ZombieSamurai(150));
        ArrayList<Hero> party = new ArrayList<>();
        party.add(new Warrior("War", 500));
        party.add(new Archer("Arc", 250));
        party.add(new Mage("Mage", 125));
        while (horde.size() > 0 && party.size() > 0){
            int choose;
            for(int i = 0; i < party.size(); ++i){
                if(horde.size() == 0) break;
                choose = random.nextInt(0, horde.size());
                party.get(i).attackEnemy(horde.get(choose));
                if(!horde.get(choose).isAlive()) {
                    horde.remove(choose);
                }
            }
            for(int i = 0; i < horde.size(); ++i){
                if(party.size() == 0) break;
                System.out.println(i + " " + horde.size());
                choose = random.nextInt(0, party.size());
                horde.get(i).attack(party.get(choose));
                if(!party.get(choose).isAlive()) party.remove(choose);
            }
        }
        if(party.size() == 0) System.out.println("Party died!");
        else System.out.println("Horde defeated!");

    }
}
