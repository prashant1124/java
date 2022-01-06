import java.lang.Exception;

class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {
        super("Invalid Age: Age should be between 1 to 100");
    }
}