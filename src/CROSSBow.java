public class CROSSBow extends RangedWeapon
{
    public CROSSBow()
    {
        super("CROSSBow", "Crossbow that shoots Crosses", 50, 10); //This is NOT FINAL
    }

    public CROSSBow(String name, String description, int damage, int range)
    {
        super(name, description, damage, range);
    }
}
