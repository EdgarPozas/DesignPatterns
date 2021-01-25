public class FactoryFruit implements Factory
{
    public Fruit makeElement(String type)
    {
        if(type=="Apple")
            return new Apple();
        if(type=="PineApple")
            return new PineApple();

        return null;
    }
}
