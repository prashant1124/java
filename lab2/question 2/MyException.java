import java.lang;
package MyException;

public class MyException extends Throwable
{
    public MyException(){
        super();
    }

    public Exception(String message) {
        super(message);
    }
}