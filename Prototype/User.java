public class User
{
    private String name;

    public User(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public User clone()
    {
        return new User(this.name);
    }

    @Override
    public String toString()
    {
        return "Name: "+name;
    }
}
