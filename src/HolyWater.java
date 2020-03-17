public class HolyWater extends Consumable
{
    public HolyWater()
    {
        super("Holy Water","Increases Attack", 10);
    }

    @Override
    public String toString()
    {
        return name + "\n" + description + " by " + effectAmount;
    }
}
