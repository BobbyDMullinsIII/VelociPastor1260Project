public class KeyItem extends Item
{
    public boolean isAquired;

    public KeyItem()
    {
        super();
        this.isAquired = false;
    }

    public KeyItem(String name, String description, boolean isAquired)
    {
        super(name, description);
        this.isAquired = isAquired;
    }
}
