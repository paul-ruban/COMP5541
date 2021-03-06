package util;

public class Item {
    private long id;
    private String description;

    public Item(long id, String description)
    {
        this.id = id;
        this.description = description;
    }

    public long getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return description;
    }
}
