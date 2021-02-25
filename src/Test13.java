class NoTraceException extends RuntimeException
{
    String message="My exception Occured with no stack Trace";
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
public class Test13 {
    public static void main(String[] args) {
        try
        {
            throw new NoTraceException();
        }
        catch(NoTraceException e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
