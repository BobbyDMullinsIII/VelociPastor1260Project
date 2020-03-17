public class Weapon extends Item
{
    protected int damage;

    public Weapon()
    {
        super();
        this.damage = 0;
    }

    public Weapon(String name, String description, int damage)
    {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage()
    {
        return damage;
    }

    @Override
    public String toString()
    {
        return "Weapon placeholder toString() result" ;
    }
}
