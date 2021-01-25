public class App
{
    public static void main(String[] args)
    {
        Factory factory=new Factory();
        Shape triangle = factory.makeElement("Triangle");
        triangle.draw();
        
        Shape square = factory.makeElement("Square");
        square.draw();

        Shape circle = factory.makeElement("Circle");
        circle.draw();
    }
}
