public class MultiExeptioneg {
    public static void main(String[] args) {
        try
        {
            int a[]=new int[5];
            a[5] = 1/0;
    }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound exception");
        }
        finally {
            System.out.println("This is final block");
        }

    }
}
