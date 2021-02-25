public class exeptionexe2 {
    public static void main(String[] args) {
        try
        {
            Class.forName("Test");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
