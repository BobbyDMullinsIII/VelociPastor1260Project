public abstract class Item
{
    protected String name;
    protected String description;

    public Item()
    {
        this.name = "placeholder item name";
        this.description = "placeholder item description";
    }
    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
}
