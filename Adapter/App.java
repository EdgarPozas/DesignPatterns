public class App
{
    public static void main(String[] args)
    {
        Device phone=new Phone();
        Device computer=new Computer();
        Device laptop=new Laptop();

        phone.on();
        computer.on();
        laptop.on();

        phone.off();
        computer.off();
        laptop.off();

    }
}
