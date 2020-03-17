public class RangedWeapon extends Weapon
{
    protected int range;

    public RangedWeapon()
    {
        super();
        this.range = 0;
    }

    public RangedWeapon(String name, String description, int damage, int range)
    {
        super(name, description, damage);
        this.range = range;
    }
}
