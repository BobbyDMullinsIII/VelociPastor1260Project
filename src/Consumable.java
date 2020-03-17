public class Consumable extends Item
{
    protected int effectAmount;

    public Consumable()
    {
        super();
        this.effectAmount =0 ;
    }

    public Consumable(String name, String description, int effectAmount)
    {
        super(name, description);
        this.effectAmount = effectAmount;
    }
}
