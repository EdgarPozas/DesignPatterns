public class FactoryOfFactory
{
    public Factory makeElement(String type)
    {
        if(type=="Fruit")
            return new FactoryFruit();
        else if(type=="Shape")
            return new FactoryShape();

        return null;
    }
}
