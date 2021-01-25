public class App
{
    public static void main(String[] args)
    {
        User user=new User("Edgar");
        User prototype=user.clone();

        System.out.println(user);
        System.out.println(prototype);

    }
}
