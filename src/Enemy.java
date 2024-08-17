public abstract class Enemy implements Mortal {
    private int hp;
    public Enemy(int hp){this.hp = hp;}

    public int getHp() {return hp;}

    public void setHp(int hp) {this.hp = hp;}
    public abstract void takeDamage(int damage, Hero hero);

    public void takeDamage(int damage){
        this.hp -= damage;
        System.out.println("Ouch!");
    }

    public abstract void attack(Hero hero);

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }
}
