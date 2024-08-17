public abstract class Hero implements Mortal {
    private String name;
    private int hp;
    public Hero(String name, int hp){this.name = name; this.hp = hp;}
    public String getName(){return this.name;}
    public int getHp() {return hp;}

    public void setHp(int hp) {this.hp = hp;}

    public void getDamage(int damage){
        this.hp -= damage;
        System.out.println(this.getName().toUpperCase() + " take " + damage + " damage!");
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {return this.hp > 0;}
}
