public class Director
{
    private Builder builder;

    public Director(Builder builder)
    {
        this.builder=builder;
    }

    public void make()
    {
        builder.start();
        builder.process();
        builder.end();
    }
}
