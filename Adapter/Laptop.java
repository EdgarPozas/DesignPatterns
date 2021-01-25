public class Laptop implements Device
{
    private Computer computer;

    public Laptop()
    {
        this.computer=new Computer();
    }

    @Override
    public void on()
    {
        computer.on();
        System.out.println("Laptop on...");
    }
    @Override
    public void off()
    {
        computer.off();
        System.out.println("Laptop off...");
    }
}
