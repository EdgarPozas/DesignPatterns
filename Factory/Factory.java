public class Factory
{
    public Shape makeElement(String type)
    {
        if(type=="Triangle")
            return new Triangle();
        if(type=="Square")
            return new Square();
        if(type=="Circle")
            return new Circle();

        return null;
    }
}
