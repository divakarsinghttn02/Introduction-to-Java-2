class TestClass
{
    void greets()
    {
        System.out.println("Hello");
    }
}
public class exceptionExe {
    public static void main(String[] args) {
        try{
            TestClass t=new TestClass();
            t.greets();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
