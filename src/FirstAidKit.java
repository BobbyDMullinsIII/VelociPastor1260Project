public class FirstAidKit extends Consumable
{
    public FirstAidKit()
    {
        super("First Aid Kit","Heals health ", 20);
    }

    @Override
    public String toString()
    {
        return "Name: " + name + "\nDescription: " + description + " by " + effectAmount;
    }
}
