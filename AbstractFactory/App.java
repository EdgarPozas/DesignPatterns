public class App
{
    public static void main(String[] args)
    {
        FactoryOfFactory factoryoffactory=new FactoryOfFactory();
        Factory factory=factoryoffactory.makeElement("Shape");

        Shape triangle = ((FactoryShape)factory).makeElement("Triangle");
        triangle.draw();

        Shape square = ((FactoryShape)factory).makeElement("Square");
        square.draw();

        Shape circle = ((FactoryShape)factory).makeElement("Circle");
        circle.draw();

        factory=factoryoffactory.makeElement("Fruit");

        Fruit apple = ((FactoryFruit)factory).makeElement("Apple");
        apple.smeel();

        Fruit pineapple = ((FactoryFruit)factory).makeElement("PineApple");
        pineapple.smeel();

    }
}
