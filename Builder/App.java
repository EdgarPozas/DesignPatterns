public class App
{
    public static void main(String[] args)
    {
        House house=new House("Single",2);
        Director director=new Director(house);

        director.make();
    }
}
