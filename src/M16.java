public class M16 extends RangedWeapon
{
    public M16()
    {
        super("M16", "AR-15 derivative firearm", 20, 20); //This is NOT FINAL
    }

    public M16(String name, String description, int damage, int range)
    {
        super(name, description, damage, range);
    }
}
