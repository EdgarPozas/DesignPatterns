public class House implements Builder
{
    private String type;
    private int rooms;

    public House(String type,int rooms)
    {
        this.type=type;
        this.rooms=rooms;
    }

    @Override
    public void start()
    {
        System.out.println("starting....");
    }

    @Override
    public void process()
    {
        System.out.println("processing....");
    }

    @Override
    public void end()
    {
        System.out.println("ending....");
    }

}
