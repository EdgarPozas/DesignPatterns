public class App
{
    public static void main(String[] args)
    {
        Connection conn=Connection.getInstance();
        System.out.println(conn);
        Connection conn2=Connection.getInstance();
        System.out.println(conn2);

        conn.connect();
        conn2.connect();
    }
}
