import java.lang.ArithmeticException;

class main
{
    public static void main(String[] args) throws ArithmeticException{
        if(true){
            throw new ArithmeticException("Another Arithmetic Exceptions");
        }
        
        try{
            System.out.println(5/0);
        }catch(ArithmeticException err){
            System.out.println("Error is : " + err.getMessage());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}