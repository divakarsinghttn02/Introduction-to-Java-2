import java.util.Locale;

class SingletonClass
{
    private static SingletonClass s_Instance=null;
    public String s;
    private SingletonClass()
    {
        s="Hello I am string of Singleton class";
    }
    public static SingletonClass getInstance()
    {
        if(s_Instance==null)
        {
            s_Instance=new SingletonClass();
        }
        return s_Instance;
    }

}
public class Singleton {
    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();
        SingletonClass y=SingletonClass.getInstance();
        System.out.println("String from x : "+x.s);
        System.out.println("string from y :"+y.s);
        x.s=(x.s).toLowerCase();
        System.out.println("Now String from x : "+x.s);
        System.out.println("Now String from x : "+y.s);
    }
}
