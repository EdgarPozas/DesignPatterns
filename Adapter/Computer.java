public class Computer implements Device
{
    @Override
    public void on()
    {
        System.out.println("Computer on...");
    }
    @Override
    public void off()
    {
        System.out.println("Computer off...");
    }
}
